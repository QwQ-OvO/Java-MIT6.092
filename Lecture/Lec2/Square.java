package Lec2;

public class Square {

    public static void printSquare(int x) {
        System.out.println(x * x);
    }

    public static void main(String[] args) {
        int value = 2;
        printSquare(2);
        printSquare(3);
        printSquare(value * 2);
    }
}
