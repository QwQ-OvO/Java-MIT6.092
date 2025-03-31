package Lec5;

public class CreditCard {

    /** 使用 private修饰符保护敏感字段 */
    private String cardNumber;
    private double expense;

    /** 提供公共方法安全访问字段 */
    public void charge(double amount) {
        expense += amount;
    }

    public String getCardNumber(String password) {
        if (password.equals("entelecheia")) {
            return cardNumber;
        }
        return "jerkface";
    }

}
