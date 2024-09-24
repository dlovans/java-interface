package Vehicle;

/**
 * Represents a bicycle.
 * Implements Vehicle.
 */
public class Bicycle implements Vehicle {
    /**
     * Bicycle spectating unexpected events.
     */
    public void move() {
        System.out.println("Bicycle sees speeding car.");
        System.out.println("Bicycle slows down to 20km/h.");
        System.out.println("Bicycle plings: Pling pling pling pling");
        System.out.println("Bicycle makes a hard left and right.");
        System.out.println("Bicycle watches recently crashed car.");
    }
}
