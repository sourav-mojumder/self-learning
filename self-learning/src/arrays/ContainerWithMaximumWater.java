package arrays;

public class ContainerWithMaximumWater {
    public static int containerWithMostWater(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while (left < right) {

            int l = Math.min(height[left], height[right]);
            int b = right - left;
            int area = l * b;
            maxArea = Math.max(maxArea, area);

            // figure out the logic to change left n right
            if (height[left] <= height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }

        }
        // Replace this placeholder return statement with your code
        return maxArea;
    }
}
