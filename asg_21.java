// Interface for shapes
interface Polygon {
    double getArea(int length, int breadth);
}

// Class implementing the interface for Rectangle
class Rectangle implements Polygon {
    @Override
    public double getArea(int length, int breadth) {
        return length * breadth;
    }
}

// Main class to test the implementation
public class asg_21 {
    public static void main(String[] args) {
        int length = 5;
        int breadth = 6;

        // Creating an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Calculating the area of the rectangle
        double area = rectangle.getArea(length, breadth);

        // Displaying the area of the rectangle
        System.out.println("Area of the rectangle: " + area);
    }
}
