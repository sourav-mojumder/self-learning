package arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {


    private static Pair findTwoSum(int[] arr, int x) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] == x)
                return new Pair(arr[left], arr[right]);
            else if (arr[left] + arr[right] > x)
                right--;
            else
                left++;
        }

        return null;
    }

    // O(n) -- space complexity
    private static Pair findTwoSum2(int[] arr, int x) {

        Set<Integer> nums = new HashSet<>();
        for (int v : arr) {
            if (nums.contains(x - v))
                return new Pair(v, x - v);
            else
                nums.add(v);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findTwoSum(arr, 19));
    }
}

class Pair {
    int first;
    int two;

    public Pair(int first, int two) {
        this.first = first;
        this.two = two;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", two=" + two +
                '}';
    }
}