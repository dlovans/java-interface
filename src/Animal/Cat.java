package Animal;

/**
 * Represents a cat.
 * Implements Animal.
 */
public class Cat implements Animal {
    /**
     * Cat meows.
     */
    public void sound() {
        System.out.println("Meow");
    }

    /**
     * Cat eats.
     */
    public void eat() {
        System.out.println("Cat eats dog.");
    }
}
