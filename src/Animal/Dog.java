package Animal;

/**
 * Represents a dog.
 * Implements Animal.
 */
public class Dog implements Animal {
    /**
     * Dog barks.
     */
    public void sound() {
        System.out.println("Auu Auu");
    }

    /**
     * Dog eats.
     */
    public void eat() {
        System.out.println("Dog eats cat...");
    }
}
