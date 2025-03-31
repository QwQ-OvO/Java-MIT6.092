package Lec5;

public class Counter {

    /**
     * 实例变量的独立性：对象私有，不同对象之间互不影响
     * 实例变量：每个对象独立拥有自己的 myCount
     */
    int myCount = 0; // 实例变量
    /**
     * 静态变量（类变量）的共享性：类共享，所有对象操作同一份数据
     * 所有实例共享同一份静态变量，修改后全局生效
     * 所有 Counter 对象共享 ourCount
     */
    static int ourCount = 0; // 静态变量

    /**
     * increment 方法：同时增加实例变量和静态变量
     */
    void increment() {
        myCount++; // 修改当前对象的 myCount
        ourCount++; // 修改所有对象共享的 ourCount
    }

    public static void main(String[] args) {
        /** 创建两个 Counter 对象 */
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        /** 操作 counter1 的 increment 方法两次 */
        counter1.increment();;
        counter1.increment();

        /** 操作 counter2 的 increment 方法一次 */
        counter2.increment();

        System.out.println("Counter 1: " + counter1.myCount + " " + counter1.ourCount);
        System.out.println("Counter 2: " + counter2.myCount + " " + counter2.ourCount);
    }
}
