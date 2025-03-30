package Lec4;

public class PrintlnDebuging {

    public static void main(String[] args) {

        int minVal = Integer.MAX_VALUE;
        int[] vals = { 22, 33, 55, 44, 11 } ;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] < minVal) {
                /**
                 * 在寻找数组最小值的过程中，每当找到一个更小的值时，就会打印：
                 * 当前的最小值（cur min: 某值
                 * 新发现的最小值（new min: 某值）
                 */
                System.out.println("cur min: " + minVal);
                System.out.println("new min: " + vals[i]);
                minVal = vals[i];
            }
        }
        System.out.println("Final minVal is: " + minVal);
    }
}
