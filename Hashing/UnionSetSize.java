package com.ishara.Hashing;

import java.util.HashSet;

public class UnionSetSize {
    static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {3,4,5,6};
        System.out.println(findUnion(nums1,nums2));

    }

    private static int findUnion(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int val : nums1){
            set.add(val);
        }
        for(int val : nums2){
            set.add(val);
        }

        return set.size();
    }

}
