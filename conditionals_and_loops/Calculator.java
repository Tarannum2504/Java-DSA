package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(" Menu: 1. Add  2. Subtract 3. Multiply 4. Divide 5. Exit");
            int choice = sc.nextInt();
            System.out.println("Enter the numbers:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println(n1 + n2);
                case 2 -> System.out.println(n1 - n2);
                case 3 -> System.out.println(n1 * n2);
                case 4 -> {
                    if (n2 == 0) {
                        System.out.println("Denominator can't be zero");
                    } else {
                        System.out.println(n1 / n2);
                    }
                }
                case 5 -> {
                    System.out.println("Calculations are finished!!");
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }
    }
}
