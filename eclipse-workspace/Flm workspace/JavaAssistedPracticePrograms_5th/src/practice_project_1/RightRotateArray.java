package practice_project_1;
public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sample array
        int steps = 5; // Number of steps to rotate

        System.out.println("Original Array:");
        printArray(arr);

        rightRotate(arr, steps);

        System.out.println("\nArray after right rotation by " + steps + " steps:");
        printArray(arr);
    }

    // Function to right rotate an array by 'steps' steps
    public static void rightRotate(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length; // Adjust steps in case it's greater than array length

        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, length - 1);
    }

    // Function to reverse an array or a part of an array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
