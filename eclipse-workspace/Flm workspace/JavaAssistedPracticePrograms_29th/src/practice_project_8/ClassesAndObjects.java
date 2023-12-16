package practice_project_8;

class Car {
    String brand;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Accord";
        car2.year = 2021;

        // Displaying details of the cars
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}
