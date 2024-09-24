import Animal.*;
import Shape.*;
import ElectronicDevice.*;
import Vehicle.*;
import Player.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        animalInteractions(new Dog(), new Cat());
        printAreaAndPerimeter(new Rectangle(5, 5), new Circle(5));
        testDevices();
        freewayEvents(new Car(), new Bicycle());
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
     * @param rectangle - A rectangle.
     * @param circle - A circle.
     */
    private static void printAreaAndPerimeter(Rectangle rectangle, Circle circle) {
        System.out.printf("%.2f\n", rectangle.area());
        System.out.printf("%.2f\n", rectangle.perimeter());
        System.out.printf("%.2f\n", circle.area());
        System.out.printf("%.2f\n", circle.perimeter());
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
     * @param car - A car.
     * @param bicycle - A bicycle.
     */
    private static void freewayEvents(Car car, Bicycle bicycle) {
        car.move();
        bicycle.move();
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