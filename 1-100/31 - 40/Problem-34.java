/**Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1]. */

class Solution {
    public int[] searchRange(int[] nums, int target) {
       int start = -1; 
        int inc =0;int fl=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target && fl ==0){
                start = i;
                fl=1;
            } 
            else if(nums[i] ==target) {
                inc++;
            }
        }
        return new int[]{start, start+inc};
        
    }
}