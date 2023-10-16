package arrays;

public class MinInRotatedArray {

    private static int findMinInRotatedArray(int[] arr) {

        //when n == 1
        if (arr.length == 1) {
            return arr[0];
        }
        int left = 0, right = arr.length - 1;

        // when the array is already sorted
        if (arr[right] > arr[left])
            return arr[0];
        while (left <= right) {

            int mid = left + ((right - left) / 2);
            if (arr[mid] < arr[mid - 1])
                return arr[mid];
            if (arr[mid] > arr[mid + 1])
                return arr[mid + 1];
            if (arr[mid] > arr[left])
                // left side is sorted our min is not present at this end
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
