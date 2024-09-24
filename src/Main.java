import Animal.*;
import Shape.*;

public class Main {
    public static void main(String[] args) {
        animalInteractions(new Dog(), new Cat());
        printAreaAndPerimeter(new Rectangle(5, 5), new Circle(5));
    }

    /**
     * Animal interactions, using Animal package.
     * @param dog - A dog.
     * @param cat - A cat.
     */
    private static void animalInteractions(Dog dog, Cat cat) {
        dog.sound();
        cat.sound();
        dog.eat();
        cat.eat();
    }

    /**
     * Prints area of shapes.
     * @param rectangle - A rectangle.
     * @param circle - A circle.
     */
    private static void printAreaAndPerimeter(Rectangle rectangle, Circle circle) {
        System.out.printf("%.2f\n", rectangle.area());
        System.out.printf("%.2f\n", rectangle.perimeter());
        System.out.printf("%.2f\n", circle.area());
        System.out.printf("%.2f\n", circle.perimeter());
    }
}