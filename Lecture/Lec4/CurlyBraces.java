package Lec4;

public class CurlyBraces {

    public static void main(String[] args) {

        /**
         * 由于这里没有使用花括号{}来包围循环体，
         * 所以循环体只包含紧跟在 for语句后的第一条语句（即打印"Hi"的语句）。
         * 打印"Bye"的语句不在循环体内，它只会在整个循环完成后执行一次。
         */
        for (int i = 0; i < 5; i++)
            System.out.println("Hi");
        System.out.println("Bye");
    }
}
