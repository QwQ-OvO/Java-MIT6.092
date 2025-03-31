package Lec5;

import java.util.TreeSet;

/**
 * TreeSet 示例类，演示有序集合的基本操作及其与 ArrayList 的异同
 */
public class SetExample {

    public static void main(String[] args) {
        // 初始化一个 TreeSet（基于红黑树实现，元素按自然顺序排序）
        // 与 ArrayList 的异同：
        // - 同：都实现 Collection 接口，支持增删查操作。
        // - 异：
        //   - TreeSet 元素唯一且有序，ArrayList 允许重复且保留插入顺序。
        //   - TreeSet 的增删查操作时间复杂度为 O(log n)，ArrayList 的查和随机访问为 O(1)，但增删（非末尾）为 O(n)。
        TreeSet<String> strings = new TreeSet<String>();

        // 添加元素（自动排序）
        strings.add("Evan"); // 插入后顺序：Adam, Evan, Eugene（字典序）
        strings.add("Eugene"); // TreeSet 会按字符串的 compareTo 方法排序
        strings.add("Adam"); // 触发自动排序，最终顺序：Adam, Eugene, Evan

        // 输出集合大小（元素唯一，重复元素不会被添加）
        System.out.println(strings.size());
        // 获取第一个元素（排序后的最小值）
        System.out.println(strings.first());
        // 获取最后一个元素（排序后的最大值）
        System.out.println(strings.last());

        // 删除指定元素（按值删除，时间复杂度 O(log n)）
        strings.remove("Eugene");

        // 遍历集合（按排序顺序）
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
