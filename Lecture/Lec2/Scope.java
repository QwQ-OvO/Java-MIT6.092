package Lec2;

public class Scope {

    public static void main(String[] args) {
        /** 已经声明 x */
        int x = 5;
        if (x == 5) {
            /** 在if块内部，应该只修改x的值，而不是重新声明 */
            x = 6; // int x = 6改为 x = 6;
            int y = 72;
            System.out.println("x= " + x + "y= " + y);
        }
        /**
         * y变量作用域错误
         * 变量y在if块内部定义（第9行），但在if块外部（第12行）尝试使用
         */
        System.out.println("x= " + x); // 删去y相关语句
    }
}
