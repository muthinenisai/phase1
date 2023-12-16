package practice_project_3;
public class RangeSum {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 1, 5}; // Sample array
        int n = arr.length; // Number of elements in the array

        int L = 1; // Left index of the range
        int R = 4; // Right index of the range

        if (isValidRange(L, R, n)) {
            int sum = calculateRangeSum(arr, L, R);
            System.out.println("Sum of elements in the range [" + L + ", " + R + "] is: " + sum);
        } else {
            System.out.println("Invalid range or array length.");
        }
    }

    // Function to check if the range and array length are valid
    public static boolean isValidRange(int L, int R, int n) {
        return (L >= 0 && R < n && L <= R && n > 0);
    }

    // Function to calculate the sum of elements in the given range
    public static int calculateRangeSum(int[] arr, int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
