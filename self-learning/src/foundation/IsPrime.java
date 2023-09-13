package foundation;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1; i<= n; i++){
            int input = scn.nextInt();
            isPrime(input);
        }

    }

    private static void isPrime(int input) {

        if(input == 1) {
            System.out.println("prime");
            return;
        }
        if(input == 2) {
            System.out.println("not prime");
            return;
        }
        for (int i = 2; i * i < input ; i++){
             if(input % i == 0){
                 System.out.println("not prime");
                 return;
             }
        }
        System.out.println("prime");
    }
}
