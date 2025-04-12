package Lec7.Exception;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class MyException extends Exception {

    /**
     * Java中异常处理的基础实现
     * throws ArrayIndexOutOfBoundsException - 声明此方法可能抛出数组索引越界异常
     */
    public Object get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException("" + index);
        }
        return null;
    }

    /**
     * 使用try-catch块捕获异常
     */
    public void exampleTryCatch() {
        try {
            // 尝试调用可能抛出异常的方法
            Object obj = get(-1);
            /**
             * 参数 e
             * 异常对象引用：它是对被捕获的异常对象的引用变量
             * 携带异常信息：通过这个引用，可以访问异常的详细信息
             *
             * e.getMessage(): 获取异常消息
             * e.printStackTrace(): 打印异常堆栈跟踪
             * e.getCause(): 获取导致此异常的原因（如果有的话）
             */
        } catch (ArrayIndexOutOfBoundsException e) {
            // 捕获并处理数组索引越界异常
            System.out.println("Oh dear:!");
            System.out.println("Caught exception: " + e.getMessage());
            /**
             * finally 块是可选的
             * 需要确保某些清理代码一定执行时使用
             * 处理需要释放的资源(文件、数据库连接等)使用
             */
        } finally {
            // finally块始终会执行，无论是否发生异常
            System.out.println("Try-catch block completed");
        }
    }

    /**
     * throws 声明
     * 当一个方法可能产生你不想在方法内部处理的异常时，
     * 可以使用方法签名中的 throws 关键字声明该方法"抛出"该异常。
     * 这实际上将处理异常的责任传递给调用此方法的代码
     *
     * doBad() 方法调用 get(-1)，这很可能会引发数组越界异常
     * 方法声明 throws ArrayOutOfBoundsException，表明它不会处理这个异常
     * 调用 doBad() 的代码必须准备处理这个异常
     */
    void dobad() throws ArrayIndexOutOfBoundsException {
        get(-1);
    }

    /**
     * 异常如何在调用栈中传播：
     * main() 方法调用 doBad() 方法
     * doBad() 方法调用 get() 方法
     * get() 方法发现索引无效，抛出异常
     * 异常沿着调用栈向上传播：get() → doBad() → main()
     * 在这个过程中，如果任何方法捕获并处理了异常，传播会停止
     * 如果没有方法处理异常，最终会到达 main()，程序可能终止并显示错误信息
     *
     * 如果一个异常一直传播到 main() 方法且未被捕获：
     * Java会打印堆栈跟踪（stack trace）错误信息
     * 这个错误信息包含异常类型和调用链，有助于调试
     * 程序通常会终止执行
     */
    public static void main(String[] args) {}
}

/**
 * 参考资料
 * https://docs.oracle.com/javase/tutorial/essential/exceptions/
 * https://en.wikipedia.org/wiki/Exception
 */
