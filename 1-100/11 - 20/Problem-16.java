/**Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */


 import java.util.*;

 class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int ret = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i=0; i<nums.length - 2; i++){
            int start = i+1; int end = nums.length - 1;
        
            while(start < end){
                int sum = nums[start] + nums[end] + nums[i];
                if(sum == target) return sum;
                else if(sum < target) start ++;
                else end --;
                
                if(Math.abs(ret - target) > Math.abs(sum - target)) ret = sum;
                
            }
               
        }
           return ret;
        
    }
}