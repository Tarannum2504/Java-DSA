package com.ishara.string;

import java.util.ArrayList;

public class Operator {
    static void main(String[] args) {
        System.out.println('a' + 'b');  // 195   added the ASCII value of characters
        System.out.println("a" + 'b');  //ab
        System.out.println("a" + "b");  // ab    concatenation of two string


        // Operator Overloading - + is used for concatenation
        System.out.println((char)('a' + 3));  // d   first 97+3 = 100 and 100 is ASCII value of d
        System.out.println(10 + 10 + "10");  //2010    first both integers added and then concatenate
        // integer will be converted to Integer that will call toString()
        System.out.println(10 + "10" + 10);  //101010

        System.out.println("Ishara" + new ArrayList<>());  //Ishara[]
        System.out.println("Ishara" + new Integer(21));  //Ishara21
        String answer = new Integer(21) + "" + new ArrayList<>();  //21[]
        System.out.println(answer);

        int x = 'a' - 'b';
        System.out.println(x);

    }

    }


