package com.ishara.methods;

import java.util.Scanner;

public class CheckPrime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (checkPrime(num) == true) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }

    static boolean checkPrime(int n){
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
