package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int x = num;
        int c =0;
        while(x>0){
            x=x/10;
            c++;
        }
        double result=0;
        int y=num;
        while(y>0){
            int digit=y%10;
            result = result + Math.pow(digit,c);
            y=y/10;

        }
        if(result==num){
            System.out.println(num+ " is an Armstrong Number");
        }else{
            System.out.println(num+ " is not an Armstrong Number");
        }

    }
}
