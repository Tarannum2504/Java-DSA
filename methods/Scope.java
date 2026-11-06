package com.ishara.methods;

import com.sun.security.jgss.GSSUtil;

public class Scope {
    // 4. class scope
    int x = 5;  // class variable

    //shadowing
    static int y = 10;
    static void main(String[] args) {

        // 1. method scope
        int a =10;
        int b = 20;
        String name = "Tara";
//        int a = 30;   // can't initialize the variable that is already intialized in the same method
        a = 30;  //we can change the value to variable that is initialized in same variable


        // 2. Block scope
        {
//            String name = "Ishara";  // can't initialize it again
            name = "Ishara"; //we can change the string here
            System.out.println(name);

//            int a = 20;    // can't initialize the same variable that is initialized outside the block
            a= 40;   // can change value
            int c = 90;  // can initialize the new variable in a block, but the scope will be limited to the block only.
        }

//        System.out.println(c);  // we can't access c out of the block
        int c = 100; // since the scope of that c was limited to block only we can initialize c outside that block
        System.out.println(c);
        System.out.println(a);  //will print 40

        // 3. Scoping for a loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // System.out.println(i);  // we can't access this i outside the loop.



        // shadowing
        System.out.println(y);  // 10
        int y;   // the class variable at line 10 is shadowed by it
        // System.out.println(y);  // it will show error as scope actually begins when the value is initialized
        y = 30;
        System.out.println(y);  // 30
        fun();  // 10 not 30 as the scope of y=30 is only in this psvm() and out fun() is outside it.

        // class scope
        Scope myobj = new Scope();
        System.out.println(myobj.x);   // can access class variable by creating object of the class
//        System.out.println(x);  //it will give error as the scope of x is not static so we can't use it in a static fun.
    }

    static void fun(){
        System.out.println(y); // return 10
    }
}
