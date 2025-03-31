package Lec5;

/**
 * Baby 类模拟婴儿的喂食和排便行为
 * 演示类作用域、成员变量与局部变量的区分
 */
public class Baby {
    /**
     * 成员变量 servings（类级作用域）
     * - 作用域：整个类内可见
     * - 初始值：int 类型默认值为 0
     * - 生命周期：与对象共存亡
     */
    int servings;

    /**
     * feed 方法：给婴儿喂食
     * @param servings 本次喂食的量（方法参数，方法级作用域）
     * 关键点：
     * - 参数名 servings 与成员变量同名，导致变量遮蔽（shadowing）
     * - 必须使用 this.servings 明确指向成员变量
     */
    void feed(int servings) {
        this.servings += servings; // this.servings 表示成员变量；servings 表示方法参数
    }

    /**
     * poop 方法：婴儿排便后重置喂食量
     * 关键点：
     * - 方法内无同名局部变量，可直接访问成员变量 servings
     * - 此处 servings 等价于 this.servings
     */
    void poop() {
        System.out.println(("All better!"));
        this.servings = 0;
    }
}
