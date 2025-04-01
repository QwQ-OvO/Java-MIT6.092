package assign1;

/**
 * The output of the unmodified program:
 * "The object's position after 10.0 seconds is 0.0 m."
 */
class GravityCalculator {
    public static void main(String[] arguments) {
        double a = -9.81; // Acceleration in m/s^2
        double initialVelocity = 0.0; // InitialVelocity in m/s
        double t = 10.0; // Times in s
        double xi = 0.0; //InitialPosition
        double vi = 0.0;// Initial velocity in m/s
        double xt = 0.5 * a * ( t * t ) + vi * t + xi;
        System.out.println("The object's position after " + t +
                " seconds is " + xt + " m.");

    }
}
