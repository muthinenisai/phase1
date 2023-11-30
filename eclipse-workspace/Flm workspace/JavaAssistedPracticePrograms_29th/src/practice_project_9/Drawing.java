package practice_project_9;



interface Shape {
    default void draw() {
        System.out.println("Default drawing");
    }
}

interface Color {
    default void applyColor() {
        System.out.println("Default color applied");
    }
}

public class Drawing implements Shape, Color {
    public void customDrawing() {
        System.out.println("Performing a custom drawing");
    }

    public void performDrawing() {
        Shape.super.draw();
    }

    public void performColoring() {
        Color.super.applyColor();
    }

    public static void main(String[] args) {
        Drawing instance = new Drawing();
        instance.customDrawing();
        instance.performDrawing();
        instance.performColoring();
    }
}