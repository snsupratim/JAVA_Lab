// import java.util.Scanner;

// public class test01 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a decimal number: ");
//         int decimal = scanner.nextInt();

//         String hexadecimal = convertDecimalToHexadecimal(decimal);

//         System.out.println("Hexadecimal equivalent: " + hexadecimal);

//         scanner.close();
//     }

//     public static String convertDecimalToHexadecimal(int decimal) {
//         if (decimal == 0) {
//             return "0";
//         }

//         StringBuilder hex = new StringBuilder();
//         while (decimal > 0) {
//             int remainder = decimal % 16;
//             if (remainder < 10) {
//                 hex.insert(0, (char) ('0' + remainder));
//             } else {
//                 hex.insert(0, (char) ('A' + remainder - 10));
//             }
//             decimal /= 16;
//         }

//         return hex.toString();
//     }
// }

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        scanner.close();
    }
}
