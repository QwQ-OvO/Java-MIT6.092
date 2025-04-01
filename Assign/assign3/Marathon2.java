package assign3;

public class Marathon2 {

    public static int findFastest(int[] times) {
        int maxIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[maxIndex]) {
                maxIndex = i;
            }
        }
        /**
         * return 语句在循环外
         * 需要完成整个数组的遍历后才能确定最快的索引
         * 如果把 return 放在循环内部，当找到第一个比当前最快更快的选手时，方法就会立即返回，而不会继续检查剩余的选手
         */
        return maxIndex;
    }

    public static int findSecondFast(int[] times, int maxIndex) {
        int secondFastIndex = (maxIndex == 0) ? 1  : 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] == times[maxIndex]) {
                continue;
            }
            else if (times[i] < times[secondFastIndex]) {
                secondFastIndex = i;
            }
        }
        return secondFastIndex;
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

        /**
         * times 代表的是整个时间数组的变量名
         * 将 times 作为参数传递给方法，告诉方法"使用这个名为 times 的数组来执行操作"
         */
        int fastestIndex = findFastest(times);
        /**
         * 当调用一个方法时，必须提供该方法声明中定义的所有参数
         * 变量名只在其声明的作用域内有意义,此处maxIndex被声明为fastestIndex
         */
        int secondFastIndex = findSecondFast(times, fastestIndex);

        System.out.println("The fastest is " + names[fastestIndex] + ": " + times[fastestIndex]);
        System.out.println("The fastest is " + names[secondFastIndex] + ": " + times[secondFastIndex]);
    }
}
