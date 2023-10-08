package arrays;

public class ReplaceEvenWithTwoSameNumber {

    private static void replaceEvenWithTwoSameNumbers(int[] arr) {

        int lastElementIndex = getLastElementIndex(arr);
        int lastIndex = arr.length - 1;
        while (lastIndex > lastElementIndex) {
            if (arr[lastElementIndex] % 2 == 0)
                arr[lastIndex--] = arr[lastElementIndex];

            arr[lastIndex--] = arr[lastElementIndex--];

        }
    }

    private static int getLastElementIndex(int[] arr) {
        int count = 0;
        while (arr[count] != -1)
            count++;
        return count - 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, -1, -1, -1};
        replaceEvenWithTwoSameNumbers(arr);
        for (int v :
                arr) {
            System.out.print(v + " ");

        }
    }
}
