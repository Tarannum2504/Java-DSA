package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int fact = 1;

        if (n < 0) {
            System.out.println("Factorial of a negative number is not possible");
        } else {
                for (int i = 2; i<=n; i++) {
                    fact = fact * i;

                }
            System.out.println("factorial of given number is: " + fact);
            }

        }

    }

