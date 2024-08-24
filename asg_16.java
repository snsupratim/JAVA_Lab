public class asg_16 {
    // Method to perform addition of integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to perform addition of floating-point numbers
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        asg_16 mathOps = new asg_16();

        // Perform addition of integers
        int resultInt = mathOps.sum(5, 3);
        System.out.println("Sum of integers: " + resultInt);

        // Perform addition of floating-point numbers
        double resultDouble = mathOps.sum(3.5, 2.5);
        System.out.println("Sum of floating-point numbers: " + resultDouble);
    }
}
