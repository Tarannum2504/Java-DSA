package com.ishara.string;

import java.util.Arrays;

public class Strings {
    static void main(String[] args) {
        // 1. immutable
        String name = "Ishara";   // name is pointing to Ishara in heap
//      String name = "Tara";   //error : variable name scope is already defined i.e,we can't change the object

        name = "Tarannum khan";   // here we created a new object.now name is pointing to Tara in heap (Ishara object goes to garbage collection)
        System.out.println(name); // Tara

        // Comparision
        String a = "Ishara";  // a is pointing to Ishara in string pool inside heap memory
        String b = "Ishara";  // b is also pointing to same object ishara in string pool inside heap memory
        System.out.println(a==b);  // true  as they are pointing to same object
        System.out.println(a.equals(b));  // true   (only check value not object)
        System.out.println(a.compareTo(b));  // 0   (check or compare each character in a string )

        // in case of c and d they both are pointing to different object outside the string pool (new keyword forced to create new object outside pool)
        String c = new String("Ishara");
        String d = new String("Ishara");
        System.out.println(c==d);  // false  as they are pointing to different objects
        System.out.println(c.equals(d));  // true   (only check value not object)
        System.out.println(c.compareTo(d));  // 0

        // extracting any specific index of a string
        System.out.println(name.charAt(0));  //T

        System.out.println(name.indexOf('a'));  //1 returns index of first occurence of a
        System.out.println(name.indexOf("khan")); // 9

        // Type conversions
        int num = 59;
        String str = Integer.toString(num);  // "59"
        System.out.println(str.length());  // easy to find length of number after converting it in string

        int num2 = Integer.parseInt(str); //59
        System.out.println(num2);

        // Other Methods
        System.out.println(Arrays.toString(name.toCharArray()));  //[T, a, r, a, n, n, u, m,  , k, h, a, n]
        System.out.println(name.toLowerCase());  // tarannum khan    it doesn't change original object ...
        System.out.println(name);  //Tarannum khan
        System.out.println(name.strip());  // whitespaces at start gets removed
        System.out.println(Arrays.toString(name.split(" ")));  //[Tarannum, khan]
        System.out.println(name.split(" "));  //[Ljava.lang.String;@27716f4
        //if we don't use arrays class toString method so println call default toString method and it will convert in some hashcode

        System.out.println(Arrays.toString(a.split("a")));   //[Ish, r]
        System.out.println(name.trim()); // all leading and trailing white space removed
        System.out.println(name.replace("m","n"));
        name.toLowerCase();
    }
}
