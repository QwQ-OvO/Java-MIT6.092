package Lec3;

public class ArrayLoopExample1 {

    public static void main(String[] args) {
        /** 创建一个长度为5的整型数组（默认初始化为全0）*/
        int[] values = new int[5]; // new 的作用是分配内存空间

        /** 通过 for 循环遍历数组 */
        for (int i = 0; i < values.length; i++) {
            /** 1. 为数组元素赋值：索引i对应值i（0,1,2,3,4） */
            values[i] = i;
            /** 2. 计算当前元素的平方 */
            int y = values[i] * values[i];
            /** 3. 输出结果 */
            System.out.println(y);
        }
    }
}
