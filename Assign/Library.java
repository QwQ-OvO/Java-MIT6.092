/**
 * Library 类 - 管理图书馆的书籍集合和基础操作
 * 核心功能：添加书籍、借阅/归还书籍、打印信息和可用书籍列表
 */
public class Library {

    //----------------- 成员变量 -----------------
    String address; // 图书馆地址
    Book[] collection; // 存储书籍的数组
    int bookCount; // 当前已存储的书籍数量

    //----------------- 静态常量 -----------------
    public static String OPEN_TIMES = "Libraries are open daily from 9am to 5pm";

    //----------------- 构造函数 -----------------
    /**
     * 构造函数：初始化图书馆地址和书籍数组
     * @param address 图书馆地址
     */
    public Library(String address) {
        this.address = address;
        this.collection = new Book[10]; // 初始化容量为10
        this.bookCount = 0;
    }

    //----------------- 实例方法 -----------------
    /**
     * 向图书馆中添加一本新书
     * @param newBook 要添加的 Book 对象
     */
    public void addBook(Book newBook) {
        collection[bookCount] = newBook;
        bookCount++;
    }

    /**
     * 打印图书馆地址
     */
    public void printAddress() {
        System.out.println(this.address);
    }

    /**
     * 根据书名借阅书籍
     * @param bookTitle 要借阅的书籍标题
     */
    public void borrowBook(String bookTitle) {
        // 标记是否找到书籍的布尔变量（初始为未找到）
        boolean found = false;

        // 遍历图书馆中的所有书籍（仅遍历已存储的有效书籍，避免空指针）
        for (int i = 0; i < bookCount; i++) { //没懂为什么不是i<bookCount-1
            // 获取当前索引位置的书籍对象引用 - 没懂； books[i] 可能是具体 Book 对象 - 为什么是可能
            Book book = collection[i]; // 没懂为什么赋值了一个Book类的book变量
            // 比较当前书籍的标题与目标标题，调用了Book类中方法，但为什么是“book.”
            if (book.getTitle().equals(bookTitle)) {
                // 找到书籍，标记为 true
                found = true;
            }
            // 检查书籍是否已被借出，调用Book类方法
            if (book.isBorrowed()) {
                // 情况1：书籍已借出
                System.out.println("Sorry, this book is already borrowed.");
            } else {
                // 情况2：书籍未借出，执行借阅操作
                book.borrowed();
                System.out.println("You successfully borrowed" + bookTitle);
            }
            // 找到书籍后立即退出循环，无需继续遍历
            break;
        }
        // 遍历结束后，若未找到书籍（found 仍为 false）
        if (!found) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    /**
     * 根据书名归还书籍
     * @param bookTitle 要归还的书籍标题
     */
    public void returnBook(String bookTitle) {
        for (int i = 0; i < bookCount; i++) {
            Book book = collection[i];
            if (book.getTitle().equals(bookTitle)) {
                if (book.isBorrowed()) { //isBorrowed 是查询当前借阅状态的方法
                    book.returned();
                    System.out.println("You successfully returned " + bookTitle);
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return; //为什么这里是return不是break
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    /**
     * 打印所有可借阅的书籍标题
     */
    public void printAvailableBooks() {
        boolean hasAvailable = false;
        for (int i = 0; i < bookCount; i++) {
            Book book = collection[i];
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                hasAvailable = true; // 这里为什么要设置一个是否开关
            }
        }
        if (!hasAvailable) { // !hasAvailable是为false的意思？
            System.out.println("No book in catalog");
        }
    }

    //----------------- 静态方法 -----------------
    /**
     * 打印图书馆开放时间（所有图书馆共享）
     */
    public static void printOpeningHours() {
        System.out.println(OPEN_TIMES);
    }

    //----------------- main 方法 -----------------
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
