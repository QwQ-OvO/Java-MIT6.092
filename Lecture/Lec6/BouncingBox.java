package Lec6;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 接口实现类（实现 Drawable 接口）
 * 功能：绘制弹跳方块，并实现运动逻辑
 * 实现要点：
 * 1. 必须实现接口中声明的所有方法（draw()）
 * 2. 可扩展特有方法（如 setMovementVector()）
 */
public class BouncingBox implements Drawable {
    private int x, y; //方块坐标,变量声明不需要括号
    private Color color; //方块颜色
    private int dx = 1, dy = 1; //运动方向

    public BouncingBox(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * 实现接口的 draw() 方法
     * @param surface 画布对象
     */
    @Override //注释，用于明确表示一个方法是覆盖父类或接口中的方法
    public void draw(Graphics surface) {
        surface.setColor(color);
        surface.fillRect(x, y, 50, 50); //绘制方块
    }

    /**
     * 特有方法：设置运动方向
     * @param dx X轴方向速度
     * @param dy Y轴方向速度
     */
    public void setMovementVector(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
