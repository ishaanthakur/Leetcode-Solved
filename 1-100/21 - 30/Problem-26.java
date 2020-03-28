/**Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        else if(nums.length == 1) return 1;
        int temp = nums[0];
        int count = 1;
        for(int i=0; i<nums.length ; i++){
            if(nums[i] != temp){
                temp = nums[i];
                count ++;
                nums[count-1] = temp;
            }
            
        }
        return count;
    }
}