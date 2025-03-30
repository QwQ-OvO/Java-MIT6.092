package Lec4;

/**
 * Baby 类 - 表示一个婴儿对象，演示面向对象基础、封装、构造方法、方法重载等核心概念
 */
public class Baby {
    //----------------- 类属性声明区域 -----------------
    /**
     * 实例变量命名规范：小驼峰式，体现封装性（应设为private，此处为演示暂用默认权限）
     * 知识点：成员变量 vs 局部变量
     */
    String name;        // 婴儿姓名
    double weight;      // 体重（kg），使用double类型更精确
    boolean isMale;     // 性别标识（true=男性）
    int numPoops;       // 排便次数统计
    Baby[] siblings;    // 自引用数据结构：存储兄弟姊妹对象数组

    //----------------- 构造方法区域 -----------------
    /**
     * 全参构造方法 - 规范的对象初始化方式
     * @param name 姓名（参数名与成员变量同名时需用this区分）
     * @param isMale 性别标识
     * 知识点：
     * 1. this关键字的作用：消除成员变量与局部变量命名冲突
     * 2. 构造方法没有返回类型声明
     * 3. 方法参数属于局部变量，作用域仅限于方法内部
     */
    public Baby(String name, boolean isMale) {
        this.name = name;       // this指向当前实例的成员变量
        this.isMale = isMale;
        this.weight = 5.0;      // 默认体重初始化
        this.numPoops = 0;      // 显式初始化更清晰
        this.siblings = new Baby[0]; // 初始化空数组避免NullPointerException
    }

    //----------------- 成员方法区域 -----------------
    /**
     * sayHi方法 - 演示实例方法的基本结构
     * 知识点：
     * 1. 实例方法可以直接访问所有成员变量
     * 2. 方法签名=方法名+参数列表（此处为无参方法）
     */
    void sayHi() {
        System.out.println("Hi, my name is " + this.name); // 显式使用this增强可读性
    }

    /**
     * eat方法 - 带参数和校验逻辑的实例方法
     * @param foodWeight 食物重量（单位kg）
     * 知识点：
     * 1. 方法参数的数据类型校验
     * 2. 方法返回值设计（void表示无需返回）
     */
    void eat(double foodWeight) {
        if (foodWeight >= 0 && foodWeight < this.weight) { // 合理的业务逻辑校验
            this.weight += foodWeight;
            System.out.printf("%s 进食 %.2fkg，当前体重：%.2fkg\n",
                    this.name, foodWeight, this.weight);
        } else {
            System.out.println("无效的食物重量！");
        }
    }

    //----------------- 静态成员区域 -----------------
    /**
     * 静态变量 - 统计创建的Baby实例总数
     * 知识点：
     * 1. static关键字表示类级变量
     * 2. 命名规范：全大写+下划线分割（可选）
     */
    private static int TOTAL_BABIES_CREATED = 0;

    //----------------- 程序入口 -----------------
    /**
     * main方法 - 程序执行入口
     * 知识点：
     * 1. main必须声明为public static void
     * 2. String[] args参数接收命令行参数
     */
    public static void main(String[] args) {
        // 对象实例化演示
        Baby shiloh = new Baby("Shiloh Jolie-Pitt", true);
        Baby knox = new Baby("Knox Jolie-Pitt", true);

        // 字段访问演示（实际应通过getter方法）
        System.out.println("=== 对象初始化状态 ===");
        System.out.println(shiloh.name + "的性别：" + (shiloh.isMale ? "男" : "女"));
        System.out.println(shiloh.name + "的排便次数：" + shiloh.numPoops);

        // 方法调用演示
        System.out.println("\n=== 方法调用演示 ===");
        shiloh.sayHi();
        shiloh.eat(0.8);
        shiloh.eat(-0.5);  // 触发无效输入处理

        // 静态变量访问演示
        System.out.println("\n=== 统计信息 ===");
        System.out.println("已创建的婴儿数量：" + TOTAL_BABIES_CREATED);
    }
}