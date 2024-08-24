import java.util.Arrays;

public class asg_20 {
    public static void main(String[] args) {
        // First Array
        int[] firstArray = {1, 2, 3, 4, 5};
        
        // Second Array
        int[] secondArray = {6, 7, 8, 9, 10};

        // Merge two arrays
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        // Copy elements of the first array to the merged array
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[i] = firstArray[i];
        }

        // Copy elements of the second array to the merged array
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[firstArray.length + i] = secondArray[i];
        }

        // Display the first array
        System.out.println("First Array = " + Arrays.toString(firstArray));

        // Display the second array
        System.out.println("Second Array = " + Arrays.toString(secondArray));

        // Display the merged array
        System.out.println("Merge two Array Elements = " + Arrays.toString(mergedArray));
    }
}
