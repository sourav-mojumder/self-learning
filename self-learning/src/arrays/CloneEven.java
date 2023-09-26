package arrays;

public class CloneEven {

    private static void cloneEven(int[] arr) {
        if(arr == null)
            return;
        if(arr.length == 1)
            return;

        int end = arr.length - 1;
        int i = findLastIndex(arr);
        while (i >= 0) {
            if (arr[i] % 2 == 0)
                arr[end--] = arr[i];
            arr[end--] = arr[i--];
        }
    }

    private static int findLastIndex(int[] arr) {
        int counter = 0;
        for (int j : arr) {
            if (j == -1)
                break;
            counter++;
        }
        return counter - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 0, 3, -1, -1, -1};
        cloneEven(arr);
        for (int v : arr)
            System.out.print(v + " ");
    }
}
