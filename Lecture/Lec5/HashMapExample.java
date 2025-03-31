package Lec5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // 创建一个 HashMap 对象，使用泛型指定键和值都是 String 类型
        HashMap<String, String> strings = new HashMap<String, String>();

        // 使用 put 方法向 HashMap 中添加键值对
        strings.put("Evan", "email1");
        strings.put("Eugene", "email2");
        strings.put("Adam", "email3");

        // 使用 size 方法获取 HashMap 中键值对的数量
        System.out.println(strings.size());
        // 使用 remove 方法删除指定键的键值对
        strings.remove("Evan");
        // 使用 get 方法获取指定键对应的值
        System.out.println(strings.get("Eugene"));

        // 使用 keySet 方法获取所有键的集合，并使用增强型 for 循环遍历
        for (String s : strings.keySet()) {
            System.out.println(s);
        }
        // 使用 values 方法获取所有值的集合，并遍历
        for (String s : strings.values()) {
            System.out.println(s);
        }
        // 使用 entrySet 方法获取所有键值对的集合，并遍历
        for (Map.Entry<String, String> pairs : strings.entrySet()) {
            System.out.println(pairs);
            // 输出为：
            // Adam=email3
            // Eugene=email2

            // 注意：也可以使用 pairs.getKey() 获取键，pairs.getValue() 获取值
            // 例如: System.out.println(pairs.getKey() + ":" + pairs.getValue());
        }

    }
}
