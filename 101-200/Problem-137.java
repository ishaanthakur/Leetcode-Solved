/**Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,3,2]
Output: 3
Example 2:

Input: [0,1,0,1,0,1,99]
Output: 99 */

class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])) mp.put(nums[i], mp.get(nums[i])+1);
            else mp.put(nums[i], 1);
            
            
        }
        int temp = nums[0];
       for(Map.Entry<Integer, Integer> e : mp.entrySet()){
           if(e.getValue() == 1){
               temp = e.getKey();
               break;
           }
           
           
       }
        return temp;
    }
}