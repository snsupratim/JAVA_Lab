public class asg_5 {
    public static void main(String[] args) {
        // Initialize variables
        int a = 5;
        int b = 10;

        // Display the values before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values
        int temp = a;
        a = b;
        b = temp;

        // Display the values after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
