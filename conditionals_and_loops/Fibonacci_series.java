package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class Fibonacci_series {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n1 = 0;
        int n2= 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i< num;i++){
            int n3 = n2;
            n2= n1+n2;
            n1=n3;
            System.out.println(n2);
        }

}}


