package com.ishara.string;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
//        String str = "" ;
//        String str = null ;
        if(checkPalindrome(str)){
            System.out.println("It is a valid palindrome!!");
        }else{
            System.out.println("Not a palindrome!!");
        }
        }
        static boolean checkPalindrome(String str){
        if(str == null || str.length() ==0){
            return true ;
        }
            str= str.toLowerCase();

            for(int i=0 ; i<str.length()/2 ; i++){
                char front = str.charAt(i);
                char back = str.charAt(str.length() -1-i);
                if(front != back){
                    return false;
                }
            }
            return true ;

        }

    }

