import Animal.*;

public class Main {
    public static void main(String[] args) {
        animalInteractions(new Dog(), new Cat());
    }

    /**
     * Animal interactions, using Animal package.
     * @param dog - A dog.
     * @param cat - A cat.
     */
    private static void animalInteractions(Animal dog, Animal cat) {
        dog.sound();
        cat.sound();
        dog.eat();
        cat.eat();
    }
}