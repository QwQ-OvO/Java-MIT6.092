package Lec1;

public class DoMath2 {

    public static void main(String[] args) {

        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);

        /**
         * 创建副本变量 copy 进行操作
         * 原变量值保持不变，新变量独立存储
         * 修改copy不会影响score
         */
        double copy = score;
        copy = copy / 2.0;
        System.out.println(copy);
    }
}
