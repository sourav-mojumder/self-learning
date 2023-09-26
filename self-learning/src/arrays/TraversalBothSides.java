package arrays;

public class TraversalBothSides {

    private static void traverseBothEnds(int[] arr) {
        int low = 0, high = arr.length - 1;
        while(low < high)
            swap(arr, low++, high--);

    }

    private static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1, 9};
        traverseBothEnds(a);
        for (int v: a) {
            System.out.print(v+" ");
        }
    }
}
