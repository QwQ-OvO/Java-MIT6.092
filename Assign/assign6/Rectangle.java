package assign6;

import java.awt.BasicStroke; // 导入BasicStroke类，用于定义线条的粗细、样式
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D; // 导入Graphics的子类Graphics2D类，提供更高级的2D绘图功能

public class Rectangle implements Sprite {
    private int width;
    private int height;
    private Color color;
    /**
     * Create a box that has dimensions width and height, filled with
     * startColor.
     */
    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.setColor(color);
        surface.fillRect(x, y, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawRect(x, y, width, height);
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
