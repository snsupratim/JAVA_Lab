import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class asg_28 {
    public static void main(String[] args) {
        // Create an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create an instance of Random class
        Random random = new Random();

        // Add 10 random numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100)); // Random number between 0 and 99
        }

        // Display the list of random numbers
        System.out.println("List of random numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Sort the list of numbers
        Collections.sort(numbers);

        // Display the sorted list of numbers
        System.out.println("\nSorted list of numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
