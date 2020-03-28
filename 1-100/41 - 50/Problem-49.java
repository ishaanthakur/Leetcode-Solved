/**Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if(mp.get(temp) == null) mp.put(temp, new ArrayList<String>());
            List<String> t = new ArrayList<>();
            t = mp.get(temp);
            t.add(s);
            mp.put(temp,t);
        }
        List<List<String>> ret = new ArrayList<>();
        for(List<String> ll : mp.values()){
            ret.add(ll);
        }
        return ret;
        
    }
}