package arrays;

public class ReverseAnArray {

    private static void reverseAnArray(int[] arr) {

        if (arr == null)
            return;

        int left = 0, right = arr.length - 1;
        while (left < right)
            swap(arr, left++, right--);
    }

    private static void swap(int[] arr, int to, int from) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        reverseAnArray(arr);

        for (int element : arr)
            System.out.print(element + " ");
    }
}
