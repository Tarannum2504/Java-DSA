package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class SubtractTheSumAndProduct {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int num = sc.nextInt();
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }
        System.out.println(product-sum);
    }
}