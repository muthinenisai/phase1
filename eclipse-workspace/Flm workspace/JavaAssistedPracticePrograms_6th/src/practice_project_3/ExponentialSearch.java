package practice_project_3;
public class ExponentialSearch {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            } else if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target); // Search in the left half
            } else {
                return binarySearch(arr, mid + 1, right, target); // Search in the right half
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        if (arr[0] == target) {
            return 0; // Return 0 if the target is at the first index
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2; // Exponentially increase the search range
        }

        return binarySearch(arr, i / 2, Math.min(i, n - 1), target); // Perform binary search in the range
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = exponentialSearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
