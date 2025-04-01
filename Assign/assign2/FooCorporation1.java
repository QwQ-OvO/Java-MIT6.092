package assign2;

public class FooCorporation1 {

    /** 如果不使用void，设定返回值为double，无法直接提示报错，只能使用特殊值表示错误*/
    public static double getPaid(double basePay, int hoursWork) {
        double generalPay = basePay * hoursWork;
        double extraPay = generalPay + (basePay * 1.5) * hoursWork;

        if (basePay < 8){
            return -1.0;
        }
        else if (hoursWork > 40 && hoursWork < 60) {
            return extraPay;
        }
        else if (hoursWork > 60) {
            return -1.0;
        }
        return generalPay;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Employee1 get paid: " + getPaid(7.5, 35));
        System.out.println("Employee2 get paid: " + getPaid(8.2, 47));
        System.out.println("Employee3 get paid: " + getPaid(10.00, 73));
    }
}
