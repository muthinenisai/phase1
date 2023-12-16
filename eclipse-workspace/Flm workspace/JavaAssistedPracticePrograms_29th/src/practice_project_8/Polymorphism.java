package practice_project_8;


class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        // Polymorphic method calls
        shape1.draw(); // Calls draw() method of Circle
        shape2.draw(); // Calls draw() method of Square
    }
}
