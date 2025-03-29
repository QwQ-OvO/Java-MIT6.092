package Lec3;

public class ArraysLengthVariable {

    public static void main(String[] args) {

        int[] values = new int[12];
        int size = values.length;

        int[] values2 = { 1, 2, 3, 4, 5};
        int size2 = values2.length;

        System.out.println(size + " " + size2);
    }
}

/**
 * 数组的.length属性用于获取其固定长度
 * 无论数组通过new动态创建或直接初始化，.length均能正确返回元素数量
 */
