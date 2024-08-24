import java.util.Arrays;

public class asg_19 {
    public static void main(String[] args) {
        // Original array
        int[] array = {1, 2, 3, 4, 5};

        // Create a new array to copy the elements
        int[] copyArray = new int[array.length];

        // Copy the elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }

        // Display the original array
        System.out.println("Array = " + Arrays.toString(array));

        // Display the copied array
        System.out.println("Copy Array Elements one to Another Array = " + Arrays.toString(copyArray));
    }
}
