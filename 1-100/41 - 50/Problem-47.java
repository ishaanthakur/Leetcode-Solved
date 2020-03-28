/**Given a collection of numbers that might contain duplicates, return all possible unique permutations. */


class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        
        backtrack(ret, new ArrayList<>(), nums, new boolean[nums.length]);
        return ret;
    }
    
    public void backtrack(List<List<Integer>> ret, List<Integer> temp, int[] nums, boolean[] used){
        if(temp.size() == nums.length){
            ret.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0; i<nums.length; i++){
                 if(used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i - 1])) continue;
                temp.add(nums[i]);
                used[i] = true;
                backtrack(ret,temp, nums, used);
                used[i] = false;
                temp.remove(temp.size() -1);
            }
        }
    }
}