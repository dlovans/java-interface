package ElectronicDevice;

/**
 * Represents a radio.
 * Implements ElectronicDevice.
 */
public class Radio implements ElectronicDevice {
    /**
     * Radio model.
     */
    final private String radioModel;

    /**
     * Creates an instance of Radio.
     * @param radioModel - Radio model.
     */
    public Radio(String radioModel) {
        this.radioModel = radioModel;
    }

    /**
     * Turns on radio.
     */
    public void turnOn() {
        System.out.println("Radio" + this.radioModel + " is ON");
    }

    /**
     * Turns off radio.
     */
    public void turnOff() {
        System.out.println("Radio" + this.radioModel + " is OFF");
    }

}
