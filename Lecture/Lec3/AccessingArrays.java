package Lec3;

public class AccessingArrays {

    public static void main(String[] args) {

        /** 初始化一个整型数组，包含四个元素 */
        int[] values = { 12, 24, -23, 47};
        /** 修改数组中索引为 3（第四个元素）的值 */
        values[3] = 18;
        int x = values[1] +3;
        int y = values[3];

        System.out.println(x + " " + y);
    }
}
