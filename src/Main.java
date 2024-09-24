import Animal.*;
import Shape.*;
import ElectronicDevice.*;
import Vehicle.*;
import Player.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        animalInteractions(new Dog(), new Cat());
        printAreaAndPerimeter(new Rectangle(5, 5));
        printAreaAndPerimeter(new Circle(5));
        testDevices();
        freewayEvents(new Car());
        freewayEvents(new Bicycle());
        mediaPlayback(new AudioPlayer());
        mediaPlayback(new VideoPlayer());
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
     * @param shape - A shape.
     */
    private static void printAreaAndPerimeter(Shape shape) {
        System.out.printf("%.2f\n", shape.area());
        System.out.printf("%.2f\n", shape.perimeter());
    }

    /**
     * Test devices by turning on and off.
     */
    private static void testDevices() {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();
        devices.add(new TV("Samsung"));
        devices.add(new TV("LG"));
        devices.add(new TV("Acer"));
        devices.add(new Radio("Toshiba"));
        devices.add(new Radio("Something"));
        devices.add(new Radio("Ancient"));

        // Turn on devices.
        for (ElectronicDevice device : devices) {
            device.turnOn();
        }

        // Turn off devices.
        for (ElectronicDevice device : devices) {
            device.turnOff();
        }
    }

    /**
     * Events unfolding on the freeway, two perspectives.
     * @param vehicle - A vehicle
     */
    private static void freewayEvents(Vehicle vehicle) {
        vehicle.move();
    }

    /**
     * Media playback.
     * @param player - Media player.
     */
    private static void mediaPlayback(Player player) {
        player.play();
        player.pause();
        player.stop();
    }
}