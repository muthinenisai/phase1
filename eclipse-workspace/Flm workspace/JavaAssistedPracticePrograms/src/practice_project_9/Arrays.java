package practice_project_9;

public class Arrays {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = new int[5];

        // Initializing the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        // Displaying the elements of the array
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Accessing individual elements
        System.out.println("\nElement at index 2: " + numbers[2]);

        // Modifying an element
        numbers[3] = 10;

        // Displaying the modified array
        System.out.print("Modified array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Creating an array of strings
        String[] names = {"sai", "kiran", "kumar"};

        // Displaying the elements of the string array
        System.out.print("\nString array elements: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
