package assign6;

import java.awt.BasicStroke; // 导入BasicStroke类，用于定义线条的粗细、样式
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;// 导入Graphics的子类Graphics2D类，提供更高级的2D绘图功能

/**
 * Rectangle类实现了Sprite接口，表示一个可绘制的矩形。
 * 该类封装了矩形的宽度、高度和颜色属性，并提供绘制方法。
 */
public class Oral implements Sprite {
    /** 实例变量（对象状态） */
    private int width;
    private int height;
    private Color color; // 填充颜色

    /** Constructor */
    public Oral(int width, int height, Color color) {
        // 使用this关键字引用实例变量，避免与参数名冲突
        this.width = width;
        this.height = height;
        this.color = color; //将参数赋值给实例变量
    }

    /**
     * 在指定位置绘制 Oral。
     * 该方法实现了Sprite接口的draw方法。
     *
     * @param surface 用于绘制的Graphics对象（绘图上下文）
     * @param leftX  左上角的x坐标
     * @param topY   左上角的y坐标
     */
    @Override
    public void draw(Graphics surface, int leftX, int topY) {
        // 设置填充颜色为Oral的颜色属性
        surface.setColor(color); //方法可以直接访问所属类的实例变量
        // 绘制填充的 Oral
        surface.fillOval(leftX, topY, width, height);
        // 设置边框颜色为黑色
        surface.setColor(Color.BLACK);
        // 将Graphics对象强制转换为Graphics2D以使用高级功能
        // 设置线条粗细为3像素，f代表float（而非double）
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        // 绘制边框
        surface.drawOval(leftX, topY, width, height);
    }

    /**
     * 获取 Oral的宽度。
     * @return Oral宽度（像素）
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * 获取 Oral的高度。
     * @return Oral高度（像素）
     */
    @Override
    public int getHeight() {
        return height;
    }

}
