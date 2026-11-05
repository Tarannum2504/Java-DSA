package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class PrintSumTillZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter the digit:");
            int num = sc.nextInt();
            if(num==0) {
                break;
            }else{
                sum= sum+num;
            }
        }
        System.out.println(sum);
    }
}
