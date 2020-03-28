/**Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, int[]> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                if(mp.get(nums[i])[1] == -1) mp.put(nums[i], new int[]{i, i-mp.get(nums[i])[0]});
                else {
                 mp.put(nums[i], new int[]{i,Math.min(mp.get(nums[i])[1] , i- mp.get(nums[i])[0] )});
                }
                
            }
            else{
                mp.put(nums[i], new int[]{i, -1});
            }
            
            
        }
        
        for(int[] it : mp.values()){
           
           System.out.println(it[1]);
            if(it[1] != -1 && it[1] <=k) return true;
        }
        return false;
        
    }
}