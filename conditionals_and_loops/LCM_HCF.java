package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class LCM_HCF {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        int HCF = 1;
        while(b !=0){
            int rem = a % b;
            if(rem == 0){
                break;
            }else{
                a=b;
                b = rem;
                HCF = b;
            }
        }
        System.out.println("HCF of given number is: " + HCF);

        System.out.println("LCM of given number is: " + (num1 * num2)/HCF);


    }
}
