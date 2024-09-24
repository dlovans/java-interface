package Shape;

/**
 * Represents a rectangle.
 * Implements Shape.
 */
public class Rectangle implements Shape {
    /**
     * Width of rectangle.
     */
    final private double width;

    /**
     * Height of rectangle.
     */
    final private double height;

    /**
     * Creates an instance of Rectangle.
     * @param width - Width of rectangle.
     * @param height - Height of rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates area of rectangle.
     * @return - Area of rectangle.
     */
    public double area() {
        return width * height;
    }

    /**
     * Calculates perimeter of rectangle.
     * @return - Perimeter of rectangle.
     */
    public double perimeter() {
        return 2 * (width + height);
    }
}
