/** Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

*/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ret, new ArrayList<>(), nums, 0);
        return ret;
        
    }
    public void backtrack(List<List<Integer>> ret, List<Integer> temp, int[] nums, int start){
        ret.add(new ArrayList<>(temp));
       
        for(int i=start; i<nums.length; i++){
               if(i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(ret, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
        
    }
}