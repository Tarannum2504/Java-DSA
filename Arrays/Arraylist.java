package com.ishara.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // Syntax
            ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);

//        System.out.println(list.contains(765432));
//        System.out.println(list);
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

            // input
            for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
            }

            // get item at any index
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
            }

            System.out.println(list);


            // FOR MULTI-DIMENSIONAL ARRAY

            ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

            // initialisation
            for (int i = 0; i < 3; i++) {
                list2.add(new ArrayList<>());
            }

            // add elements
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list2.get(i).add(in.nextInt());
                }
            }

            System.out.println(list2);


        }
    }
