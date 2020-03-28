/**You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. F
 * ind all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
If it does not exist, output -1 for this number. */


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i : nums1) mp.put(i, -1);
        int foo = 0;
        
       for(int i : nums1){
         
           for(int j=0; j<nums2.length; j++){
               if(nums2[j] == i) foo =1;
               if(foo == 1 && nums2[j] > i) {
                mp.put(i, nums2[j]);
               break;
                                                                         
            }
               
           }
           foo =0;
       }
        int[] ret = new int[nums1.length];
        for(int i=0; i<ret.length; i++){
            ret[i] = mp.get(nums1[i]);
        }
        return ret;
    }
}