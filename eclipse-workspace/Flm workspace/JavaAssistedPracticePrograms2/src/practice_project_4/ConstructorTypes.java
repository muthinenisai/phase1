package practice_project_4;

public class ConstructorTypes {

    private String make;
    private String model;
    private int year;
    private String color;

    // Default constructor
    public ConstructorTypes() {
        System.out.println("Creating a default car.");
    }

    // Parameterized constructor with make, model, year, and color parameters
    public ConstructorTypes(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("Creating a car with parameters: " + make + " " + model + " " + year + " " + color);
    }

    // Copy constructor
    public ConstructorTypes(ConstructorTypes original) {
        this.make = original.make;
        this.model = original.model;
        this.year = original.year;
        this.color = original.color;
        System.out.println("Creating a car by copying another car.");
    }

    public static void main(String[] args) {
        // Creating a default car
        ConstructorTypes defaultCar = new ConstructorTypes();

        // Creating a car with parameters
        ConstructorTypes parameterizedCar = new ConstructorTypes("Toyota", "Camry", 2022, "Blue");

        // Creating a car by copying another car
        ConstructorTypes originalCar = new ConstructorTypes("Honda", "Civic", 2021, "Red");
        ConstructorTypes copiedCar = new ConstructorTypes(originalCar);
    }
}
