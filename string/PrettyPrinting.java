package com.ishara.string;

import java.text.MessageFormat;

public class PrettyPrinting {
    static void main(String[] args) {
        float a = 543.1264f;
        System.out.printf("Formatted number is %.2f\t\t", a);  //Formatted number is 543.13   it is also rounding off the number
        System.out.printf("Pie: %.3f\n" ,Math.PI); //Pie: 3.142  rounded off to 3 decimals
        System.out.printf("Hello I am  %s, I am %d years old.\n" , "Ishara" , 21);  //Hello I am  Ishara, I am 21 years old.

        // Better ways:
        String str = String.format("Hello %s!", "world");
        System.out.println(str);  //Hello world!

        String msg = MessageFormat.format("Hello I am  {0}, I am {1} years old.", "Ishara", 21);
        System.out.println(msg);  // Hello I am  Ishara, I am 21 years old.

        System.out.printf("Hello it\'s me %s" , "Ishara" );  // for special character (' , " , /) use \ first


        /*
        There are many format specifiers we can use. Here are some common ones:

            %c - Character
            %d - Decimal number (base 10)
            %e - Exponential floating-point number
            %f - Floating-point number
            %i - Integer (base 10)
            %o - Octal number (base 8)
            %s - String
            %u - Unsigned decimal (integer) number
            %x - Hexadecimal number (base 16)
            %t - Date/time
            %n - Newline
        */



    }
}
