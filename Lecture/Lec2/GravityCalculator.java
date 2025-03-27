package Lec2;

public class GravityCalculator {

    public static void main(String[] args) {
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;

        /**由重力加速度产生的位移，0.5gt²*/
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime;
        /**叠加初始速度对位移的贡献 +v0t*/
        finalPosition += initialVelocity * fallingTime;
        /**累加初始位置 +s0 */
        finalPosition += initialPosition;
        System.out.println("An object's position after" + fallingTime + "seconds is" + finalPosition + "m.");
    }
}
