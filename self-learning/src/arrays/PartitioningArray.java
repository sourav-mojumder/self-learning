package arrays;

public class PartitioningArray {

    private static void partition(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            if (arr[high] == 0)
                swap(arr, high, low++);
            else
                high--;

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4,2,0,1,0,3,0}; //  [0,0,0,4,1,2,3]
        partition(a);
        for (int v : a) {
            System.out.print(v + " ");
        }
    }
}
