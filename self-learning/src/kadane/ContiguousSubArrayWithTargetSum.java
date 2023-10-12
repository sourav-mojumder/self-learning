package kadane;

import java.util.Arrays;

public class ContiguousSubArrayWithTargetSum {

    private static int[] getContiguousSubArrayWithTargetSum(int[] nums, int k) {
        int start = 0, end = 1, sum = nums[0];
        while (end < nums.length) {

            if (sum == k)
                return getResultantSubArray(nums, start, end);
            else if (sum < k)
                sum += nums[end++];
            else
                sum -= nums[start++];
        }

        return new int[0];
    }

    private static int[] getResultantSubArray(int[] arr, int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++)
            result[i] = arr[start++];
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,2};
        int[] result = getContiguousSubArrayWithTargetSum(arr, 8);

        Arrays.stream(result).forEach(i -> System.out.print(i+ " "));
    }


}
