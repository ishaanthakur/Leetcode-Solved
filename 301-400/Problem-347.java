/**Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */

class Solution  {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
        if(mp.containsKey(nums[i])){
            mp.put(nums[i], mp.get(nums[i])+1);

        }
        else mp.put(nums[i], 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry e : mp.entrySet()){
            arr.add(new int[]{(int)e.getKey(), (int)e.getValue()});
        }
    Collections.sort(arr, new Comparator<int[]>() {
   public int compare(int[] a, int[] b) {
       // return (a[1]).compareTo(b[1]);
       return Integer.compare(b[1],a[1]);
   }
});
       ArrayList<Integer> ret = new ArrayList<>();
       for(int i=0; i<k; i++){
       ret.add(arr.get(i)[0]);
       }
       return ret;
       
   }
}