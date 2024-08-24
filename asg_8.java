public class asg_8 {
    public static void main(String[] args) {
        // Test Data
        String str1 = "Python";
        String str2 = "";
        
        // Sample Output
        System.out.println(createString(str1, str2));
    }

    // Function to create the string
    public static String createString(String str1, String str2) {
        // Initialize result string
        StringBuilder result = new StringBuilder();

        // Check if the length of str1 is greater than 0
        if (str1.length() > 0) {
            // Append the first character of str1 to result
            result.append(str1.charAt(0));
        } else {
            // If the length of str1 is 0, append "#"
            result.append("#");
        }

        // Check if the length of str2 is greater than 0
        if (str2.length() > 0) {
            // Append the last character of str2 to result
            result.append(str2.charAt(str2.length() - 1));
        } else {
            // If the length of str2 is 0, append "#"
            result.append("#");
        }

        return result.toString();
    }
}
