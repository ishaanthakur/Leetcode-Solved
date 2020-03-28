/**Given an array nums, write a function to move all 0's to the end of it while 
 * maintaining the relative order of the non-zero elements. */


class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
          if(i>=arr.size()) nums[i] = 0;
          else nums[i] = arr.get(i);
        }

    }
}