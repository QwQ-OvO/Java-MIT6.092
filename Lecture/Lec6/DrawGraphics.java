package Lec6;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;


/**
 * 绘图管理类
 * 功能：管理所有可绘制对象，并统一触发绘制逻辑
 */
public class DrawGraphics {

    private List<Drawable> drawables = new ArrayList<>(); // 存储可绘制对象

    public DrawGraphics() {
        // 初始化时添加示例对象
        drawables.add(new BouncingBox(100, 50, Color.RED));
        drawables.add(new BouncingBox(200, 150, Color.BLUE));
    }

    /**
     * 绘制所有图形
     * @param surface 画布对象
     */
    public void drawAll(Graphics surface) {
        for (Drawable shape : drawables) {
            shape.draw(surface); // 调用多态方法
        }
    }
}
