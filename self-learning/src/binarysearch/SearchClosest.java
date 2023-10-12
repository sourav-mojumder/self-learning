package binarysearch;

public class SearchClosest {

    private static int findClosestToTarget(int[] arr, int target) {

        int low = 0, high = arr.length - 1, mid;
        int result = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                high = mid - 1;
                int diff = arr[mid] - target;
                if (result > diff) {
                    result = diff;
                    index = mid;
                }

            } else {
                low = mid + 1;
                int diff = target - arr[mid];
                if (result > diff) {
                    result = diff;
                    index = mid;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 11};

        System.out.println(findClosestToTarget(arr, 7));
    }
}

