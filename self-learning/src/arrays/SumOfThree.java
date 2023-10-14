package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThree {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if (sum == nums[low] + nums[high]) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        //skip duplicates
                        while (low < high && nums[low] == nums[low + 1])
                            low++;
                        while (low < high && nums[high] == nums[high - 1])
                            high--;

                        low++;
                        high--;

                    } else if (nums[low] + nums[high] > sum)
                        high--;
                    else
                        low++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        //[0,1,1]
        //[0,0,0]
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}