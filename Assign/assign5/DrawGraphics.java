package assign5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * 可使用数组或使用ArrayList存储盒子存储所有盒子
 * 此处使用ArrayList
 */
public class DrawGraphics {
    // BouncingBox box; 类级别字段声明
    ArrayList<BouncingBox> boxes;

    /**
     * Initializes this class for drawing.
     * 创建盒子并添加到 list
     */
    public DrawGraphics() {
        // box = new BouncingBox(200, 50, Color.RED); 只是赋值，不是声明
        //box.setMovementVector(2, 3); // 设置移动向量，水平速度为2，垂直速度为3

        boxes = new ArrayList<>(); //创建ArrayList实例存储盒子

        /** 方法1.使用局部变量声明与初始化的方法（推荐） */
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED); // 创建一个新的BouncingBox对象，初始位置在坐标(200,50)，颜色为红色
        box1.setMovementVector(2, 3); // 设置盒子的运动向量，水平速度为2，垂直速度为3
        boxes.add(box1); // 将创建好的盒子对象添加到boxes集合中以便后续处理和渲染

        BouncingBox box2 = new BouncingBox(5,  1, Color.YELLOW);
        box2.setMovementVector(1, 0);
        boxes.add(box2);

        BouncingBox box3 = new BouncingBox(100, 100, Color.GREEN);
        box3.setMovementVector(0, 2);
        boxes.add(box3);

        /**方法2.直接添加新实例到列表，不创建局部变量 */
//        boxes.add(new BouncingBox(200, 500, Color.RED));
//        boxes.get(0).setMovementVector(2,3); // 设置移动向量，水平速度为2，垂直速度为3
//
//        boxes.add(new BouncingBox(5, 1, Color.YELLOW));
//        boxes.get(1).setMovementVector(1,0);
//
//        boxes.add(new BouncingBox(100, 100, Color.GREEN));
//        boxes.get(2).setMovementVector(0, 2);

    }

    /**
     * Draw the contents of the window on surface. Called 20 times per second.
     */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250); //绘制一条直线

        //box.draw(surface);

        /**
         * 绘制所有盒子
         * 增强型for-each循环
         * BouncingBox - 集合中元素的类型
         * box - 当前迭代的元素变量名
         * boxes - 要迭代的集合/数组
         * : - 表示"in"或"from"的关系
         * 对于boxes集合中的每一个BouncingBox类型的元素，将其称为box，并执行循环体中的代码
         */
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }

        /** 绘制椭圆 */
        surface.setColor(Color.BLUE); //对于drawOval方法，颜色仅应用在轮廓
        surface.drawOval(20, 140, 80, 50);

        /** 绘制矩形 */
        surface.setColor(Color.lightGray); //对于fillRect方法，填充颜色
        surface.fillRect(10, 200, 60, 40);

        /** 绘制多边形 */
        int[] xPoints = {200, 250, 230};
        int[] yPoints = {120, 130, 160};
        surface.setColor(Color.ORANGE);
        surface.fillPolygon(xPoints, yPoints, 3);
    }
}
