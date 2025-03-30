public class Marathon {

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

        /** 初始化最快选手的索引为 0（假设第一个选手是最快的）*/
        int maxIndex = 0;
        /** 遍历所有选手，寻找完赛时间最小的选手 */
        for (int i = 1; i < names.length; i++) {
            /** 如果当前选手的时间小于目前找到的最快时间 */
            if (times[i] < times[maxIndex]) {
                /** 更新最快选手的索引 */
                maxIndex = i;
            }
        }
        System.out.println("Fastest competitor is " + names[maxIndex] + ": " + times[maxIndex]);

        /**
         * 初始化第二快选手的索引
         * 使用三元运算符：
         * 如果最快选手在索引0，我们就用索引1作为初始比较基准
         * 如果最快选手不在索引0，我们就用索引0作为初始比较基准
         * 确保初始比较基准不是最快的选手
         */
        int secondFastIndex = (maxIndex == 0) ? 1 : 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] == times[maxIndex]) {
                continue;
            }
            else if (times[i] < times[secondFastIndex]) {
                secondFastIndex = i;
            }
        }
        System.out.println("Second Fast competitor is " + names[secondFastIndex] + ": " + times[secondFastIndex]);

    }
}
