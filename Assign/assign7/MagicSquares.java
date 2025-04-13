package assign7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {

    public static void main(String[] args) throws IOException {

        /**
         * 创建了一个FileReader对象，一个基本的字符输入流
         * 参数是文件路径
         * FileReader以字符为单位读取数据，适合处理文本文件
         */
        FileReader fileReader1 = new FileReader("./Assign/assign7/TextFiles/Mercury.txt");
        /**
         * 创建了一个BufferedReader对象，包装了前面创建的fileReader1
         * BufferedReader提供缓冲功能，提高读取效率
         * 它也提供了更高级的方法，如readLine()，可以一次读取一整行文本
         */
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        /**
         * 声明一个字符串变量line1用于存储每次读取的一行文本
         * 初始值设为null
         */
        String line1 = null;
        /**
         * bufferedReader1.readLine()方法读取一行文本并返回，如果到达文件末尾则返回null
         * line1 = bufferedReader1.readLine()将读取的文本行赋值给line1
         * != null检查是否已读到文件末尾
         */
        while ((line1 = bufferedReader1.readLine()) != null) {
            System.out.println(line1);
        }
        /**
         *  Java的I/O类采用了装饰器设计模式，
         *  BufferedReader"装饰"了FileReader，
         *  增强了它的功能（如缓冲读取、按行读取等）。
         *  装饰器模式要求高层组件负责关闭底层组件
         */
        bufferedReader1.close();

        FileReader fileReader2 = new FileReader("./Assign/assign7/TextFiles/Luna.txt");
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        String line2 = null;
        while ((line2 = bufferedReader2.readLine()) != null) {
            System.out.println(line2);
        }
        bufferedReader2.close();
    }
}
