package kadane;

public class MaxSubArraySum {

    private static int findMaxSubArraySum(int[] arr) {
        int csum = arr[0], osum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (csum > 0)
                csum += arr[i];
            else
                csum = arr[i];

            if (csum > osum)
                osum = csum;
        }

        return osum;
    }

    public static void main(String[] args) {
        //int[] arr = {1,2,-1,2,-3,2,-5};
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSubArraySum(arr));
    }
}


//  [1,2,-1,2,-3,2,-5]