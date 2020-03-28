/**Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray. */

class Solution {
    public int maxProduct(int[] nums) {
        
        int[] maxtrack = new int[nums.length];
        int[] mintrack = new int[nums.length];
        mintrack[0] = nums[0];
        maxtrack[0] = nums[0];
        int prod = nums[0];
        for(int i=1; i<nums.length; i++){
            
            mintrack[i] = Math.min(Math.min(nums[i]*maxtrack[i-1], nums[i]*mintrack[i-1]),nums[i]);
            maxtrack[i] = Math.max(Math.max(nums[i]*maxtrack[i-1], nums[i]*mintrack[i-1]), nums[i]);
            prod = Math.max(maxtrack[i], prod);
            
        }
        
        return prod;
    }
}