package Lec3;

public class UseIndentation {

    /** 使用缩进与空格的范例 */
    public static void main(String[] args) {

        int x = 5;
        x = x * x;

        if (x > 20) {
            System.out.println(x + " is greater than 20");
        }

        double y = 3.4;
    }
}

/**
 * Java代码规范中空行的使用原则是：
 * 1. 类与方法之间：空一行。
 * 2. 方法与方法之间：空一行。
 * 3. 方法内的不同逻辑块之间：根据逻辑复杂度适当空行，但不宜过多。
 * 4. 单行语句之间：通常不需要空行，除非为了强调某个部分。
 */