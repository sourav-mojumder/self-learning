package arrays;

public class RussianNationalFlag {

    private static void RNF(int[] arr) {

        int low = 0, mid = 0, high = arr.length - 1;

        while(mid <= high){

            if(arr[mid] == 1){
                swap(arr, mid++, low++);
            } else if(arr[mid] == 0)
                mid++;
            else
                swap(arr, mid, high--);
        }


    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1,2, 0, 1, 2,1,2,0};
        RNF(arr);
        for(int v : arr)
            System.out.print(v+" ");
    }
}
