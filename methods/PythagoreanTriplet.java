package com.ishara.methods;

import java.util.Scanner;

public class PythagoreanTriplet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triplet: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        pythagoreanTriplet(a,b,c);
    }

    static void pythagoreanTriplet(int a, int b, int c) {
        if((a*a + b*b)== c*c ||(b*b + c*c)== a*a || (a*a + c*c)== b*b  ){
            System.out.println("It is an Pythagorean triplet");
        }else{
            System.out.println("It is not an Pythagorean triplet");
        }
    }
}
