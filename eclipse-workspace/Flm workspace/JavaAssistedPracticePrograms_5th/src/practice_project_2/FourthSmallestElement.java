package practice_project_2;
import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 9, 30, 15, 6, 21, 8}; // Sample unsorted array

        int fourthSmallest = findFourthSmallest(arr);

        if (fourthSmallest != -1) {
            System.out.println("The fourth smallest element in the array is: " + fourthSmallest);
        } else {
            System.out.println("Array does not have enough elements to find the fourth smallest.");
        }
    }

    // Function to find the fourth smallest element in an array
    public static int findFourthSmallest(int[] arr) {
        if (arr.length < 4) {
            return -1; // Not enough elements in the array
        }

        Arrays.sort(arr); // Sort the array

        return arr[3]; // Return the fourth smallest element
    }
}
