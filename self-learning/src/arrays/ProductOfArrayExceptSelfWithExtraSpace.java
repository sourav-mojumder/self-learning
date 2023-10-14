package arrays;

public class ProductOfArrayExceptSelfWithExtraSpace {

    public static int[] productExceptSelf(int[] nums) {

        int rightProduct = 1;
        int[] rightProductArray = new int[nums.length];
        int[] result = new int[nums.length];

        //Step 1 : for the right product Array
        for (int i = nums.length - 1; i >= 0; i--) {
            rightProductArray[i] = rightProduct * nums[i];
            rightProduct = rightProductArray[i];
        }
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct * (i == nums.length - 1 ? 1 : rightProductArray[i + 1]);
            leftProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = productExceptSelf(new int[]{-1, 2, 3, 5, 0});
        for(int num : nums)
            System.out.print(num + " ");
    }
}
