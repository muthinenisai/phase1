package practice_project_8;

class Student {
    private String name;
    private int age;

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student();

        // Using encapsulation to set and get values
        student.setName("John Doe");
        student.setAge(20);

        // Displaying student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
