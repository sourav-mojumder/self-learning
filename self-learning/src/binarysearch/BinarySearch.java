package binarysearch;

public class BinarySearch {

    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid ;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println(binarySearch(arr, -10));
    }
}
