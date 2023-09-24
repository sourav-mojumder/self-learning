package arrays;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] num1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            num1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] num2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }

        int[] sum = new int[Math.max(n1, n2)];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        int c = 0;
        while (k >= 0) {
            int d = 0;
            if (i >= 0) {
                d += num1[i];
            }
            if (j >= 0)
                d += num2[j];
            d += c;

            if (d > 9) {
                c = d / 10;
                d = d % 10;
            }
            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if(c >= 1)
            System.out.print(c);
        
        for(int v : sum)
            System.out.print(v);
    }
}
