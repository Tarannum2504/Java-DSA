package com.ishara.conditionals_and_loops;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        String newString = "";
        for (int i = s.length() - 1 ; i >=0; i--) {
            newString= newString + s.charAt(i);
        }
        System.out.println(newString);
    }
}