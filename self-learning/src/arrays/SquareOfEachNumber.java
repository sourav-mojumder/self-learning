package arrays;

/*Given a sorted array in non-decreasing order,
return an array of squares of each number,also in non-decreasing order.
For example:
[-4,-2,-1,0,3,5] -> [0,1,4,9,16,25]
*/
public class SquareOfEachNumber {

    private static int[] getSquaredOfNumbers(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] result = new int[arr.length];
        int index = arr.length - 1;
        while (left < right) {
            int leftElement = arr[left];
            int rightElement = arr[right];

            if ((leftElement * leftElement) > (rightElement * rightElement)) {
                result[index--] = leftElement * leftElement;
                left++;
            } else {
                result[index--] = rightElement * rightElement;
                right--;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -2, -1, 0, 3, 5};

        for (int v : getSquaredOfNumbers(arr))
            System.out.print(v + " ");
    }
}
