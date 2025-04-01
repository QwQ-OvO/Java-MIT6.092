package Lec6;

/**
 * assertions测试方法示例
 * assign3查找最快速度的测试类
 * 功能：计算并打印每个选手时间与最快时间的差值
 */
public class MarathonTest {

    public static void main(String[] args) {

        /** 测试 1： 普通数据 */
        int[] times1 = {300, 280, 320, 295};
        System.out.println("===== 测试案例1 =====");
        printDifferenceFromFastest(times1);

        // 测试案例2：包含多个相同最小值
        int[] times2 = {250, 250, 255};
        System.out.println("\n===== 测试案例2 =====");
        printDifferenceFromFastest(times2);
    }

    /**
     * 打印每个马拉松时间与最快时间的差值
     * @param marathonTimes 包含正整数的马拉松时间数组（单位：分钟）
     * 前置条件：数组不能为空且必须包含至少一个元素
     */
    public static void printDifferenceFromFastest(int[] marathonTimes) {
        int fastestTime = findMinimum(marathonTimes);

        for (int time : marathonTimes) {
            int diff = time - fastestTime;
            assert diff >= 0;
            System.out.println("Difference: " + diff);
        }
    }

    /**
     * 查找整数数组的最小值
     * @param array 整数数组（不能为空）
     * @return 数组中的最小值
     * @throws IllegalArgumentException 如果数组为空
     */
    private static int findMinimum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }

        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
