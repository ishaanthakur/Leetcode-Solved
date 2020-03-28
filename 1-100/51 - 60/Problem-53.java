/**Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6. */

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp =new int[nums.length+1];
        dp[0] = 0;
        int ret = nums[0];
        for(int i=1; i<=nums.length; i++){
            dp[i] = Math.max(nums[i-1] + dp[i-1], nums[i-1]);
            ret = Math.max(ret, dp[i]);
        }
        return ret;
        
    }
}