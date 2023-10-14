package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (numbers.containsKey(key)) {
                result[0] = numbers.get(key);
                result[1] = i;
                return result;
            }
            numbers.put(nums[i], i);
        }
        return result;
    }

}
