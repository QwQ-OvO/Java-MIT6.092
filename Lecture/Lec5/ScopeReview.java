package Lec5;

public class ScopeReview {
    /**
     * 在 Java 中，成员变量（类级变量） 如果没有显式初始化，会被赋予默认值
     * int 类型的默认值为 0。
     * String 或对象类型默认值为 null
     */
    private int var3; //类级作用域变量（成员变量）

    void scopeMethod(int var1) { // var1 是方法参数（方法级作用域），由调用者传入值
        var3 = var1; // 将 var1 的值赋给 var3
        String var2; // var2 是方法内的局部变量（方法级作用域），必须显式初始化后才能使用（否则编译错误）

        if (var1 > 0) {
            var2 = "above 0"; // 初始化 var2
        } else {
            var2 = "less than or euqal to 0"; // 初始化 var2
        }
        System.out.println(var2);
    }
}
