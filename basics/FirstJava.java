package com.ishara.basics;

import java.util.*;
public class FirstJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        // diff. of == and equals()
        if(name.equals("Ishara")){
            System.out.println("It's me!!");
        /* == return true when two variables are pointing to same object ...
        but if two variables are pointing to different objects (maybe value is same)
        then in this case we use equals()
         */
        }

        char firstCharacter = sc.next().trim().charAt(0);   /* trim() removes the extra spaces and
                                                            charAt() retrieves the character at particular index
                                                            here it is returning index 0 i.e,first character */
        System.out.println(firstCharacter);

        // Primitive Datatypes

        byte a = 10; // 1 bytes
        short b = 100; // 2 bytes
        int n = 60;  // 4 bytes
        long longerInteger = 347689876543297L;  //8 bytes
        // by default the integer value is of type int so we add L when we want to store them in long.
        char letter = 'T'; // 2 bytes
        float decimal = 31.44f;  // 4 bytes
        // f is used because by default the decimal values are of type double, so to store them in float we add f there.
        double lonerDecimal = 3401461.1664121;  // 8 bytes
        boolean check = true;

        // if you write 2,000,000 it will show error, replace ',' with '_'

        int million = 2_000_000;



    }
}