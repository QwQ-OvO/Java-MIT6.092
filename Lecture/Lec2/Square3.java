package Lec2;

public class Square3 {

    /** void：方法不返回任何值 */
    public static void printSquare(double x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        /** 隐式转换，输出double类型值：4.0 */
        printSquare(2);
    }
}
