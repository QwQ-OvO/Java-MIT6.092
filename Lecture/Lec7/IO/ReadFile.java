package Lec7.IO;

import java.io.BufferedReader;  // 导入BufferedReader类，用于高效读取字符流
import java.io.FileReader;      // 导入FileReader类，用于读取文本文件
import java.io.IOException;     // 导入IOException类，用于处理I/O操作中可能发生的异常

/**
 * 文件读取示例类
 * 演示如何从文本文件中读取内容并打印到控制台
 */
public class ReadFile {
    /**
     * 程序入口方法
     * @throws IOException 声明此方法可能抛出IO异常，调用者需处理
     */
    public static void main(String[] args) throws IOException {
        // 创建FileReader对象
        // 参数为文件路径，此处使用相对路径
        // "./src/readme"表示项目src目录下的readme文件
        // 注意：路径格式与Eclipse项目结构有关
        FileReader fr = new FileReader("./Lecture/Lec7/IO/readme.txt");

        // 创建BufferedReader对象，包装FileReader
        // BufferedReader提供缓冲功能，可以更高效地读取文件
        // 并且提供了方便的readLine()方法用于按行读取
        BufferedReader br = new BufferedReader(fr);

        // 定义变量用于存储读取的每一行内容
        // 初始化为null，表示尚未读取任何内容
        String line = null;

        // 循环读取文件的每一行
        // br.readLine()方法读取一行文本，不包含行结束符
        // 如果到达文件末尾，返回null，循环结束
        // 赋值表达式(line = br.readLine())会先执行赋值，再判断结果是否为null
        while ((line = br.readLine()) != null) {
            // 将读取的每一行打印到控制台
            System.out.println(line);
        }

        // 读取完成后，关闭BufferedReader
        // 关闭操作会自动关闭其包装的底层FileReader
        // 关闭流是必要的步骤，可以释放系统资源
        // 在实际应用中，应该使用try-finally或try-with-resources确保资源关闭
        br.close();
    }
}

/**
 * 参考资料
 * https://docs.oracle.com/javase/tutorial/essential/io/
 */