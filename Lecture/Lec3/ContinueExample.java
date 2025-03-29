package Lec3;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            /** 当 i 等于 3 时，跳过本次循环剩余代码，直接进入下一次迭代 */
            if (i == 3 ) {
                continue;
            }
            System.out.println("Rule ##" + i);
        }
    }
}
