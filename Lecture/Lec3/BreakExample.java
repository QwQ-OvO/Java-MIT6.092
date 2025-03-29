package Lec3;

public class BreakExample {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
           /** 当 i 等于 4 时，立即终止整个循环，后续迭代不再执行 */
            if (i == 4) {
                break;
            }
            System.out.println("Rule #" + i);
        }
    }
}
