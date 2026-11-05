package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class SumOfNumberTypes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfNegatives=0;
        int sumOfPositiveEvens=0;
        int sumOfPositiveOdds=0;

        while(true){
            System.out.println("Enter the digit:");
            int num = sc.nextInt();
            if(num==0) {
                break;
            }else if(num<0){
                sumOfNegatives= sumOfNegatives+num;
            } else if (num%2 == 0) {
                sumOfPositiveEvens=sumOfPositiveEvens+num;
            }else{
                sumOfPositiveOdds=sumOfPositiveOdds+num;
            }
        }
        System.out.println(sumOfNegatives);
        System.out.println(sumOfPositiveEvens);
        System.out.println(sumOfPositiveOdds);
    }

}
