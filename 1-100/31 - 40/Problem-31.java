/**Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column. */

class Solution {
    public void nextPermutation(int[] nums) {
        
        int i= nums.length - 1;
        while(i>=1 && nums[i] <= nums[i-1]) i--;
        if(i>= 1){
            int j = nums.length - 1;
            while(j>=0 && nums[j] <= nums[i-1]){
                j--;
            }
            swap(nums, i-1, j);
        }
        reverse(nums,i);
    }
    public void swap(int[] nums, int i, int j){
        int c = nums[i];
        nums[i]=nums[j];
        nums[j] =c;
    }
    public void reverse(int[] nums, int i){
        int j= nums.length-1;
        while(i<j){
           swap(nums,i,j);i++;j--; 
        }
    }
}