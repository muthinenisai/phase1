package practice_project_6;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

            // Simulating an array index out of bounds exception
            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to retrieve from the array: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            // Close resources or perform cleanup tasks
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

    private static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
