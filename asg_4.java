import java.util.Scanner;

public class asg_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first binary number
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        // Input second binary number
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two numbers
        int sum = num1 + num2;

        // Convert sum to binary string
        String binarySum = Integer.toBinaryString(sum);

        // Output the result
        System.out.println("Sum of two binary numbers: " + binarySum);

        scanner.close();
    }
}
