public class WrapperExample {
    public static void main(String[] args) {
        // Example 1: Primitive to Object
        int primitiveInt = 10; // Primitive integer
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Converting primitive int to Integer object

        // Example 2: Object to Primitive
        Double wrapperDouble = new Double(3.14); // Double wrapper object
        double primitiveDouble = wrapperDouble.doubleValue(); // Converting Double object to primitive double

        // Printing the values
        System.out.println("Primitive integer: " + primitiveInt);
        System.out.println("Wrapper integer: " + wrapperInt);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper double: " + wrapperDouble);
    }
}
