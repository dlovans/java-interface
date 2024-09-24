package Shape;

/**
 * Represents a circle.
 * Implements Shape.
 */
public class Circle implements Shape {
    /**
     * Circle radius.
     */
    final private double radius;

    /**
     * Creates an instance of Circle.
     * @param radius - Radius of circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates area of circle.
     * @return - Area of circle.
     */
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates perimeter of circle.
     * @return - Perimeter of circle.
     */
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
