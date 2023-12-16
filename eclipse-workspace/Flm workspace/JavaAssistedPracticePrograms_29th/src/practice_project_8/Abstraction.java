package practice_project_8;

abstract class Device {
    abstract void turnOn();
}

class Phone extends Device {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    @Override
    void turnOn() {
        System.out.println("Turning on the " + brand + " phone");
    }
}

class Laptop extends Device {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    void turnOn() {
        System.out.println("Turning on the " + brand + " laptop");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Device iphone = new Phone("Apple");
        Device dellLaptop = new Laptop("Dell");

        turnOnDevice(iphone);
        turnOnDevice(dellLaptop);
    }

    static void turnOnDevice(Device device) {
        device.turnOn();
    }
}
