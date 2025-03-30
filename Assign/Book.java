/**
 * Book 类 - 表示一本可借阅的书籍，包含书名和借阅状态信息
 * 核心功能：管理书籍的借阅状态，提供基础操作方法
 */
public class Book {

    //----------------- 成员变量定义 -----------------
    /**
     * 书籍标题（书名）
     * 1. 使用默认包级访问权限（可根据需求改为private）
     * 2. 通过构造函数初始化，后续不可修改
     */
    String title;
    /**
     * 借阅状态标识
     * 1. boolean类型：true表示已借出，false表示可借阅
     * 2. 初始值为false（新书默认未借出）
     */
    boolean borrowed;

    //----------------- 构造函数 -----------------
    /**
     * 构造函数在对象创建时被调用，负责为对象的成员变量赋初始值，确保对象处于合法状态
     * this 是当前对象的引用，用于区分成员变量与局部变量（如方法参数或临时变量）
     * 当成员变量名与局部变量名不同时，this 可省略
     * @param bookTitle 书籍标题
     * 设置初始借阅状态为未借出
     */
    public Book(String bookTitle) {
        this.title = bookTitle; // 将参数赋值给成员变量
        this.borrowed = false; // 明确初始化状态，增强可读性
    }

    //----------------- 实例方法 -----------------
    /**
     * 标记书籍为已借出状态
     * 直接修改借阅状态字段
     */
    public void borrowed() {
        this.borrowed = true; // 状态更新为"已借出"
    }

    /**
     * 标记书籍为已归还状态
     * 调用即重置为未借出
     */
    public void returned() {
        this.borrowed = false; // 状态更新为"未借出"
    }

    /**
     * 查询当前借阅状态
     * @return boolean - true表示已借出，false表示可借阅
     * 1. 直接返回成员变量值，避免冗余逻辑
     * 2. 方法命名符合JavaBean规范（isXxx用于布尔值）
     */
    public boolean isBorrowed() {
        return this.borrowed; // 返回当前状态
    }

    /**
     * 获取书籍标题
     * @return String - 书籍标题
     */
    public String getTitle() {
        return this.title; // 返回书名
    }

    //----------------- 测试入口 -----------------
    /**
     * main方法 - 单元测试入口
     * 1. 对象初始化验证
     * 2. 状态变更流程验证
     * 3. 方法调用结果验证
     */
    public static void main(String[] args) {

        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
