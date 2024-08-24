import java.util.Scanner;

public class asg_18 {
    public static void main(String[] args) {
        // Input: Enter the Array Size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Array Size = ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int arr[] = new int[size];

        // Input: Read values into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Element of a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // Display in Reverse Order
        System.out.print("Display Reverse Order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
