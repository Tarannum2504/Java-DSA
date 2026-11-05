package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class CheckCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int num = sc.nextInt();
        System.out.println("Enter the number of which occurence you are trying to to find:");
        int n = sc.nextInt();
        int count=0;
        while(num>0){
            if(num % 10 == n) {
                count++;
            }
            num=num/10;

        }
        System.out.println(count);

    }
}
