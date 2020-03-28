/**Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array. */

class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums.length /2;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])) mp.put(nums[i], mp.get(nums[i]) + 1);
            else mp.put(nums[i], 1);
            
        }
        int ret = -1;
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            if(e.getValue() > temp) {
                ret = e.getKey();
                break;
            }
        }
        return ret;
        
    }
}