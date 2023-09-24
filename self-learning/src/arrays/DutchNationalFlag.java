package arrays;


public class DutchNationalFlag {

    private static void DNF(int [] arr){

        int low = 0, mid = 0, high = arr.length -1;

        while( mid <= high){

            //if mid is 0 swap with low
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 2){ //if mid is 2 swap with high
                swap(arr, mid, high);
                high--;
            } else //if mid is 1 move to the next mid
                mid++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1,2, 0, 1, 2,1,2,0};
        DNF(arr);
        for(int v : arr)
            System.out.print(v+" ");
    }
}
