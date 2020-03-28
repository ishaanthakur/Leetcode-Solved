/**Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length. */

class Solution {
    public int removeElement(int[] nums, int val) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val) arr.add(nums[i]);
            
        }
            Object[] temp = new Object[]{};
        temp = arr.toArray();
        for(int i=0; i<temp.length; i++){
            nums[i] = (int) temp[i];
        }
        return arr.size();
    }
}