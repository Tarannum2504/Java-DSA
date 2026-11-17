package com.ishara.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    static void main(String[] args) {
        // creation
        HashMap<String , Integer> map = new HashMap<>();

        // insertion
        map.put("Ishara" , 98);
        map.put("Isha" , 95);
        map.put("Tara" , 98);  // may contain same value
        map.put("Shreya" , 60);

        // print key - value pairs (order not guaranteed)
        System.out.println(map);  // {Isha=95, Shreya=60, Ishara=98, Tara=89}

        // if try to add another value with same key
        map.put("Ishara" , 100);
        System.out.println(map);  //{Isha=95, Shreya=60, Ishara=100, Tara=89}  value gets updated

        // lookup 
        if(map.containsKey("Ishara")){   // search for key -> if present returns true else false
            System.out.println(map.get("Ishara"));  // search for key -> if present then prints it's value
            System.out.println(map.get("ishara"));  // if not present returns null
        }


        // getOrDefault search key.if present it returns its value. if not present then return the default value
        System.out.println(map.getOrDefault("Sneha" , 77));  // 77
        System.out.println(map.getOrDefault("Tara" , 77));   // 89

        // Iteration in HashMap
        //import java.util.Map;   need to import this
        for(Map.Entry<String, Integer> e : map.entrySet()){  // similar as for(int val : arr){}
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e.hashCode());  // print hash value or hashcode of each key
            System.out.println(e.getClass());  // returns the class name
        }

        // Method 2:
        // import java.util.Map; need this first
        Set<String> keys = map.keySet();
        for(String key : keys ){
            System.out.println(key + " " + map.get(key));   // e.g. - Ishara 100   no order guaranteed
        }

        // size of HashMap
        System.out.println(map.size());

        // deletion
        map.remove("Shreya");
        System.out.println(map);  // {Isha=95, Ishara=100, Tara=89}

    }
}
