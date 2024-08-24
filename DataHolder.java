public class DataHolder<T> {
    private T data;

    // Constructor
    public DataHolder(T data) {
        this.data = data;
    }

    // Getter
    public T getData() {
        return data;
    }

    // Setter
    public void setData(T data) {
        this.data = data;
    }

    // Display function
    public void print() {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        // Creating instances of DataHolder with different data types
        DataHolder<Integer> intHolder = new DataHolder<>(10);
        DataHolder<String> stringHolder = new DataHolder<>("Hello");
        DataHolder<Double> doubleHolder = new DataHolder<>(3.14);

        // Displaying the data
        System.out.println("Integer Data:");
        intHolder.print();
        System.out.println("String Data:");
        stringHolder.print();
        System.out.println("Double Data:");
        doubleHolder.print();
    }
}
