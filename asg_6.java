// import java.util.Scanner;

public class asg_6 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.print("Input a decimal number: ");
        int decimalNumber = 15;

        // Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimalNumber).toUpperCase();

        // Output the result
        System.out.println("Hexadecimal number is: " + hexadecimal);

        // scanner.close();
    }
}
