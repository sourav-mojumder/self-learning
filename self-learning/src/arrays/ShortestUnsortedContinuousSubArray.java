package arrays;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubArray {

    private static int[] getShortestUnsortedSubarray(int[] arr) {

        int max = arr[0];
        int end = 0;

        for (int i = 1; i < arr.length; i++) {

            if (max > arr[i])
                end = i;
            else
                max = arr[i];
        }

        int min = arr[arr.length - 1];
        int start = 0;
        for (int i = arr.length - 2; i >= 0; i--) {

            if (min < arr[i])
                start = i;
            else
                min = arr[i];
        }

        int size = end - start + 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++)
            result[i] = arr[start++];

        return result;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 6, 4, 7, 8, 9};

        Arrays.stream(getShortestUnsortedSubarray(arr))
                .forEach(value -> System.out.print(value + " "));
    }
}
