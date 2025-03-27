package Lec1;

public class Hello3 {

    public static void main(String[] args) {
        /**
         * 第一次赋值（创建变量，声明并初始化）
         * String 是类型声明，表示 foo 是字符串类型
         * 首次在内存中为 foo 分配新内存空间
         */
        String foo = "IAP 6.092";
        System.out.println(foo);

        /**
         * 第二次赋值（已存在，修改变量内容）
         * 不可重复声明类型（String 已省略）
         * 变量已存在，直接修改引用地址
         * 变量 foo 存储的是内存地址，而非实际数据
         * 修改 foo 的值仅改变其指向的地址，不会覆盖原有数据
         */
        foo = "Something else";
        System.out.println(foo);
    }
}
