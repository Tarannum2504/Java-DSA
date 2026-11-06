package com.ishara.methods;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
        static int factorial(int n){
            int fact = 1;

            if (n < 0) {
                return 0 ;
            } else {
                for (int i = 2; i<=n; i++) {
                    fact = fact * i;

                }
                return fact;
            }
        }

    }

