package Lec4;

/**
 * assign3优化分析：
 * 变量名 maxIndex 与寻找最小值的逻辑不符
 * 不处理空数组的情况
 * 不比较索引0的元素，只是默认它为初始值
 */
public class MarathonCorrect {

    /**
     * 找出一个整数数组中最小值的索引位置的通用方法
     * 1.函数接收一个整数数组 values 作为参数
     * 2.初始化 minValue 为 Integer.MAX_VALUE（Java 中最大的整数值）
     * 3.初始化 minIndex 为 -1（表示尚未找到最小值）
     * 4.使用 for 循环遍历整个数组：
     * 对于每个元素，如果它比当前记录的最小值还小，则：更新 minValue 为该元素的值 +更新 minIndex 为该元素的索引
     * 5.遍历完成后，返回找到的最小值的索引 minIndex
     */
    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < values.length; i++) {
            /**
             * 隐式初始化
             * 初始情况处理通过设置极大值 minValue = Integer.MAX_VALUE 隐式实现
             * 无论数组中的第一个元素是什么值，它几乎肯定会小于 Integer.MAX_VALUE
             */
            if (values[i] < minValue) {
                minIndex = i;
                minValue = values[i];
            }
        }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx = getMinIndex(values);

        for (int i = 0; i < values.length; i++) {
            if (i == minIdx) {
                continue;
            }
            /**
             * 显式初始化
             * secondIdx == -1为初始情况处理
             * 如果没有 这个条件，当处理第一个非最小值元素时，代码会尝试进行 values[i] < values[secondIdx] 比较
             * 但此时 secondIdx 为 -1，访问 values[-1] 会导致数组索引越界错误
             */
            if (secondIdx == -1 || values[i] < values[secondIdx]) {
                secondIdx = i;
            }
        }
        return secondIdx;
    }


    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int minimumIdx = getMinIndex(times);
        int secondMinIdx = getSecondMinIndex(times);

        System.out.println("The fastest is " + names[minimumIdx] + ": " + times[minimumIdx]);
        System.out.println("The fastest is " + names[secondMinIdx] + ": " + times[secondMinIdx]);
    }
}
