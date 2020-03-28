/** Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] >= target) return 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == target) return i;
            if(nums[i] > target && nums[i-1]<target )return i;
            
        }
        return nums.length;
    }
}