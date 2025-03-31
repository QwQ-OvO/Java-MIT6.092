package Lec5;

/**
 * 只要导入了 java.util.ArrayList，
 * 即可直接使用其所有公共方法（如 add、get、remove 等），
 * 无需其他包的导入
 */
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        /**
         * 初始化一个存储字符串的动态数组（ArrayList）
         * 使用泛型 <String> 限制只能存储字符串类型
         * 默认初始容量为10，当元素超过容量时会自动扩容（1.5倍），由 ArrayList类的实现定义的，属于java标准库的一部分
         */
        ArrayList<String> strings= new ArrayList<String>();
        /**
         * 向列表中添加元素（添加到末尾）
         */
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");

        System.out.println(strings.size()); //输出列表的当前元素数量（size()方法）
        System.out.println(strings.get(0)); //访问列表中的元素（通过索引）
        System.out.println(strings.get(1));

        strings.set(0, "Goodbye"); //修改列表中的元素（通过索引）：将0位置的值替换为“Goodbye”
        strings.remove(1); //删除列表中的元素（通过索引）

        /**
         * 遍历方式 1：传统for循环（按索引遍历）
         * 适合需要操作索引或修改列表的场景
         */
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        /**
         * 遍历方式 2：增强型for循环（for-each循环）
         * 适用于仅需读取元素的场景
         * 在遍历时不能直接删除或插入元素
         */
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
