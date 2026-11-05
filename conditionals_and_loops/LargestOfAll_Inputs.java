package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class LargestOfAll_Inputs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        while(true){
            System.out.println("Enter the digit:");
            int num = sc.nextInt();
            if(num==0) {
                break;
            }else if(num>max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
