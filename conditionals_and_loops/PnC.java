package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class PnC {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        int factN = 1;
        int factNR = 1;
        int factR=1;

        if (n< 0) {
            System.out.println("Invalid Number");
        } else {
            for (int i = 2; i<=n; i++) {
                factN = factN * i;
            }
            for (int i = 2; i<=r; i++) {
                factR = factR * i;
            }
            for (int i = 2; i<= n-r; i++) {
                factNR = factNR * i;
            }

        }

        System.out.println("Permutation: " + factN/factNR);
        System.out.println("Combination: " + factN/(factNR * factR));
    }
}
