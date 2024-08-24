 class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; // default radius
    }

    // Constructor with parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to get radius
    public double getRadius() {
        return radius;
    }
}
public class asg_14{
    public static void main(String[] args) {
        // Constructing circle objects
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12.0);
        Circle circle3 = new Circle(24.0);

        // Displaying radius and area of each circle
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
        System.out.println("Circle 3 - Radius: " + circle3.getRadius() + ", Area: " + circle3.getArea());
    }
}
