/** There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty. */


import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> arr = new ArrayList<>();
        
        for(int i = 0; i< nums1.length; i++) arr.add(nums1[i]);
        for(int i =0; i<nums2.length; i++) arr.add(nums2[i]);
        
        Collections.sort(arr);
         // System.out.println((1+2)/2);
        if(arr.size() % 2 ==0) return ((arr.get((arr.size()/2)-1)+ arr.get(arr.size()/2 ))/2.0);
        else return arr.get((arr.size() )/2);
        
        
    }
}

