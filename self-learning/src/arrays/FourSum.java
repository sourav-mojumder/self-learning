package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int start = i + 1;
                int newTarget = target - arr[i];
                List<List<Integer>> lists = threeSum(arr, newTarget, start);
                for (List<Integer> list : lists) {
                    list.add(0, arr[i]);
                }
                result.addAll(lists);
            }

        }
        return result;
    }

    private List<List<Integer>> threeSum(int[] arr, int target, int start) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = start; i < arr.length - 2; i++) {

            if ((i == start) || (i > start && arr[i] != arr[i - 1])) {
                int newTarget = target - arr[i];
                int newStart = i + 1;
                List<List<Integer>> subLists = twoSum(arr, newTarget, newStart);
                for (List<Integer> subList : subLists) {
                    subList.add(0, arr[i]);
                }
                result.addAll(subLists);
            }
        }
        return result;
    }

    private List<List<Integer>> twoSum(int[] arr, int target, int start) {
        List<List<Integer>> result = new ArrayList<>();

        int left = start;
        int right = arr.length - 1;

        //check duplicate

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                List<Integer> subList = new ArrayList<>();
                subList.add(arr[left]);
                subList.add(arr[right]);
                result.add(subList);

                while (left < right && arr[left] == arr[left + 1])
                    left++;
                while (left < right && arr[right] == arr[right - 1])
                    right--;

                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else
                left++;
        }

        return result;

    }
}
