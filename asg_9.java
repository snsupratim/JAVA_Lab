import java.util.Scanner;

public class asg_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the starting word
        System.out.print("Enter the starting word: ");
        String startingWord = scanner.nextLine();

        // Sample data
        String string1 = "Hello how are you?";

        // Check if the string starts with the specified word
        boolean result = string1.startsWith(startingWord);

        // Output the result
        System.out.println(result);
    }
}
