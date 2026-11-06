package com.ishara.methods;

import java.util.Scanner;

public class FindAllPrime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = num1; i <num2 ; i++) {
            if (findPrime(i) == true) {
                System.out.print(i + " ");
        }

    }}

    static boolean findPrime(int n){
        if(n<2){
            return false;
        }
        int i = 2;
        while(i*i <=n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
