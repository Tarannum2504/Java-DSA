package com.ishara.methods;

import java.util.Scanner;

public class CheckPalindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(checkPalindrome(num));
    }

    static boolean checkPalindrome(int num) {
        int n = num;
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        return num == rev;
    }
}
