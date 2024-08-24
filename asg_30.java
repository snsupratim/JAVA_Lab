public class asg_30<T, U> {
    private T data1;
    private U data2;

    // Constructor
    public asg_30() {
        this.data1 = null;
        this.data2 = null;
    }

    // Setter for string
    public void setData1(T data) {
        this.data1 = data;
    }

    // Setter for integer
    public void setData2(U data) {
        this.data2 = data;
    }

    // Display function
    public void display() {
        System.out.println("Data1: " + data1);
        System.out.println("Data2: " + data2);
    }

    public static void main(String[] args) {
        // Creating an instance of asg_30
        asg_30<String, Integer> dataHolder = new asg_30<>();

        // Setting string and integer data
        dataHolder.setData1("Hello");
        dataHolder.setData2(42);

        // Displaying the data
        dataHolder.display();
    }
}
