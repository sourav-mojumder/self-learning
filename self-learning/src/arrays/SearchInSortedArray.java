package arrays;

public class SearchInSortedArray {

    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (nums[mid] == target) {
                return mid;
            }
            //check if left side of mid is sorted
            else if (nums[left] <= nums[mid]) {
                // now check if target lies in this range
                if (target >= nums[left] && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            //similar check if right side of mid is sorted
            else if (nums[mid] <= nums[right]) {
                //now check if target lies in this range
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else
                    right = mid - 1;
            }

        }

        return -1;

    }
}
