package ElectronicDevice;

import java.util.Scanner;

/**
 * Represents a TV.
 * Implements ElectronicDevice.
 */
public class TV implements ElectronicDevice {
    /**
     * TV model.
     */
    final private String televisionModel;

    /**
     * Creates an instance of TV.
     * @param televisionModel - TV model.
     */
    public TV(String televisionModel) {
        this.televisionModel = televisionModel;
    }

    /**
     * Turns on TV.
     */
    public void turnOn() {
        System.out.println("TV " + this.televisionModel + "ON");
    }

    /**
     * Turns off TV.
     */
    public void turnOff() {
        System.out.println("TV " + this.televisionModel + "OFF");
    }
}
