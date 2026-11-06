package com.ishara.methods;

import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
       fun(1,2,3,4,56,7,8,100);  // can put any no. of arguments (0 (empty arr) or more)
       fun();  // []   -> empty array due to 0 arguments
        mix(1 , "Tara", "Female", "Student","Engineer");  // [Female, Student, Engineer]

        demo(1,2,4);   // integer parameters to it will call int ...v
        demo("Tara" , "Ishara");  // string parameters so it will call string ...v
       // demo();  // this will show error as we haven't provided data so the datatype is not clear and hence we can't decide that which method should be overloaded
    }
    /* if we don't know how many argument we want to pass ,then we can pass variable argument like this (datatype ...v)
    it will create an array of arguments of  that datatype */
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));  // it will print that numbers in the form of an array
    }


    // if we want to pass a mix of arguments
    static void mix(int a, String b, String ...v){// varArgs should always at the end
        System.out.println(a + " "+ b);
        System.out.println(Arrays.toString(v));
    }


    // method overloading in VarArgs
    // multiple methods can have  same method name but with  diff. arguments (can be of same type) is method overloading.

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
