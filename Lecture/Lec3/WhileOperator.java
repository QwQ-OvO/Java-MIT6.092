package Lec3;

public class WhileOperator {

    public static void main(String[] args) {
        /** 初始化在循环外 */
        int i = 0;

        /** 模板：While (condition 条件) */
        while (i < 3) {
            System.out.println("Rule #" + i);
            /** 更新在循环内 */
            i++;
        }
    }
}
