package Lec2;

public class SquareChange {

    public static void printSquare(int x) {
        System.out.println("printSquare x = " + x);
        /** 方法内修改副本为 25 */
        x = x * x;
        System.out.println("printSquare x = " + x);
    }

    public static void main(String[] args) {
        /** main 方法初始化 x=5 */
        int x = 5;
        System.out.println("main x = " + x);
        /** 方法接收副本 x=5 */
        printSquare(x);
        /** main 中的 x 始终为 5，因为方法内的修改仅作用于副本 */
        System.out.println("main x = " + x);
    }
}
