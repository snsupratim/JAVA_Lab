import java.util.ArrayList;

public class asg_26 {
    public static void main(String[] args) {
        // Create an ArrayList to store fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");

        // Display all the fruits in the list
        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
