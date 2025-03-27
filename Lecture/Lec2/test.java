package Lec2;

public class test {

    public static void test(int x) {
        if (x > 5) {
            System.out.println(x + " is > 5");
        } else if (x == 5) {
            System.out.println(x + " equals 5");
        } else {
            System.out.println(x + " is not > 5");
        }
    }

    public static void main(String[] args) {
        test(6);
        test(5);
        test(4);
    }
}
