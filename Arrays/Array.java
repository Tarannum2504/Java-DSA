package com.ishara.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // array of primitives
            int[] arr = new int[5];
            arr[0] = 23;
            arr[1] = 45;
            arr[2] = 233;
            arr[3] = 543;
            arr[4] = 3;
            // [23, 45, 233, 543, 3]
            System.out.println(arr[3]);

            // input using for loops
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); //  here num represents element of the array
//        }

//        System.out.println(arr[5]); // Array index out of bound error

            // array of objects
            String[] str = new String[4];
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.next();
            }

            System.out.println(Arrays.toString(str));

            // modify
            str[1] = "Ishara";

            System.out.println(Arrays.toString(str));


            // Multidimensional array
             /*
             1 2 3
             4 5 6
             7 8 9
        */
//        int[][] arr = new int[3][];

//        int[][] arr1 = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr1 = new int[3][3];
        System.out.println(arr1.length); // no of rows
        // input

        for (int row = 0; row < arr1.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = sc.nextInt();
            }
        }

        // output
//        for (int row = 0; row < arr1.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr1[row].length; col++) {
//                System.out.print(arr1[row][col] + " ");
//            }
//            System.out.println();
//        }

        // output
//        for (int row = 0; row < arr1.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr1) {
            System.out.println(Arrays.toString(a));
        }
}}
