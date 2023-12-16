package practice_project_7;

public class Innerclasses {

    // Outer class
    public class MemberInnerclass {
        // Member inner class can have its own fields and methods
        public void display() {
            System.out.println("This is a member inner class.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        Innerclasses outerObject = new Innerclasses();

        // Creating an instance of the inner class
        MemberInnerclass innerObject = outerObject.new MemberInnerclass();

        // Calling a method of the inner class
        innerObject.display();
    }
}
