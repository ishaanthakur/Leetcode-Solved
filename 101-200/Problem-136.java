/**Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4 */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            
            if(mp.containsKey(nums[i])) mp.put(nums[i], mp.get(nums[i])+1);
            else mp.put(nums[i], 1);
            
        }
        for(int i=0;i<nums.length; i++){
            if(mp.get(nums[i])==1) return nums[i];
        }
        
        return 0;
    }
}