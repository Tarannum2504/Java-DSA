package com.ishara.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    static void main(String[] args) {
        //creation
        HashSet<Integer> set = new HashSet<>();

        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);

        // Search
        System.out.println(set.contains(4));   //true
        System.out.println(set.contains(5));   //false

        //size
        System.out.println(set.size());

        //print all elements
        System.out.println(set);

        // Deletion
        set.remove(4);
        System.out.println(set.contains(4)); //false
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        // functions of iterator -  it.next() , it.hasNext()
        while(it.hasNext()){
            System.out.println(it.next());     // No guarantee that the order would be same
        }

    }

}
