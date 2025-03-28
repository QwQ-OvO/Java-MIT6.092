public class FooCorporation2 {

    /**
     * getPaid 方法被定义为 void 返回类型，不返回值
     * 方法执行过程中会打印一些信息，如"needs pay: XXX"或错误信息
     */
    public static void getPaid(double basePay, int hoursWork) {
        double generalPay = basePay * hoursWork;
        double extraPay = generalPay + (basePay * 1.5) * hoursWork;

        if (basePay < 8){
            System.out.println("error: hourly employees be paid at least $8.00 an hour");
        }
        else if (hoursWork > 40 && hoursWork < 60) {
            System.out.println("needs pay: " + extraPay);
        }
        else if (hoursWork > 60) {
            System.out.println("error:an employee not work more than 60 hours in a week");
        } else {
            System.out.println("needs pay: " + generalPay);
        }
    }

    public static void main(String[] args) {
        /**
         * 主函数调用 void 类型的 getPaid 方法只会执行该方法内部的代码，而不会接收任何返回值
         * 方法内部会执行计算并通过 System.out.println() 打印相应的信息
         * 这些打印的信息会出现在控制台上，主函数无法捕获或使用这些打印的结果来进行进一步处理或显示（如 “+”连接）
         */
        System.out.println("employee1");
        getPaid(7.5, 35);
        System.out.println("employee2");
        getPaid(8.2,47);
        System.out.println("employee3");
        getPaid(10.00, 73);
    }
}

