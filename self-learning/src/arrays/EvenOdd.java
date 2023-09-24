package arrays;

public class EvenOdd {

    private static void evenOdd(int[] arr) {

        int nextEven = 0, nextOdd = arr.length - 1;

        while (nextOdd > nextEven) {
            if (arr[nextEven] % 2 == 0)
                nextEven++;
            else {
                int temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd] = temp;
                nextOdd--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 6, 7};
        evenOdd(arr);
        for (int v : arr)
            System.out.println(v);
    }
}
