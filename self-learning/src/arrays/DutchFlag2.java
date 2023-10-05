package arrays;

public class DutchFlag2 {

    /*
     * extreme left  < pivot
     * extreme right > pivot
     * in between == pivot
     * */
    private static void DNF(int[] arr, int  pivot){
        int low =0, mid =0, high = arr.length -1;

        while( mid <= high){

            if(arr[mid] < pivot)
                swap(arr, low++, mid++);
             else if(arr[mid] == pivot)
                 mid++;
             else
                 swap(arr, mid, high--);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5,2,4,4,6,4,4,3}; //  [0,0,0,4,1,2,3]
        DNF(a, 4);
        for (int v : a) {
            System.out.print(v + " ");
        }
    }
}
