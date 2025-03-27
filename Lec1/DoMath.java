public class DoMath {

    public static void main(String[] args) {

        /**
         * double属于基本数据类型，存储实际的值
         * 与引用类型区分：引用类型（如对象、数组）存储的是对象的引用（即内存地址）
         */
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);

        /**
         * 当操作基本类型时，直接修改的是变量存储的值
         * 直接修改原始变量 score，原变量地址内容被覆盖
         */
        score = score / 2.0;
        System.out.println(score);
    }
}
