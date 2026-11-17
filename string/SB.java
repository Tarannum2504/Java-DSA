package com.ishara.string;

public class SB {
    static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);
        System.out.println(builder.delete(5,15));  //zyxwvkjihgfedcba
        System.out.println(builder.deleteCharAt(8));   // zyxwvkjigfedcba  h deleted
        System.out.println(builder.capacity());  //34


    }
}

