package Lec6;


import javax.swing.JFrame;
import java.awt.Graphics;

/**
 * 主程序入口类，继承自 JFrame（Java Swing 的窗口类）
 *  JFrame 是 Java Swing 库中用于创建桌面窗口的类，
 *  继承后可以直接使用窗口相关的功能（如设置大小、标题、关闭操作等）
 * 功能：创建一个 GUI 窗口，并在窗口中绘制图形
 */
public class Main extends JFrame { // 继承 JFrame，表示这是一个窗口应用
    private DrawGraphics graphics; // 声明一个 DrawGraphics 类型的成员变量,用于管理绘图逻辑

    /**
     * 构造函数：初始化窗口设置
     */
    public Main() {
        setSize(400, 300); // 设置窗口大小为 400x300 像素
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 关闭窗口时终止程序
        graphics = new DrawGraphics();  // 初始化绘图逻辑对象
    }

    /**
     * 重写 paint 方法：负责绘制窗口内容
     * @param g 画布对象（由系统自动传入）
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g); // 调用父类 JFrame 的 paint 方法（绘制窗口边框、标题栏等）
        graphics.drawAll(g); // 调用自定义绘图逻辑，绘制所有图形

    }

    /**
     * 程序入口
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        // 创建 Main 实例（窗口对象），并显示窗口
        new Main().setVisible(true);
    }
}
