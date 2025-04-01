package Lec6;

import java.awt.*;

/**
 * Drawable 接口定义
 * 功能：定义可绘制对象的通用行为
 * 接口特点：
 * 1. 仅声明方法签名，无具体实现（抽象性）
 * 2. 实现类必须覆盖所有接口方法（契约性）
 * 3. 支持多态，统一操作不同对象（灵活性）
 */
public interface Drawable {
    /**
     * 绘制图形到指定画布
     * @param surface 画布对象（来自java.awt.Graphics）
     */
    void draw(Graphics surface);
}

/**
 * 接口声明：使用 interface 关键字定义。
 * 抽象方法：接口中的方法默认是 public abstract，无需显式声明。
 * 多态基础：任何实现 Drawable 的类都可被统一操作。
 */
