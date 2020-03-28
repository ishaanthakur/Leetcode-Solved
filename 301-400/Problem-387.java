/**Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters. */

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(mp.containsKey(s.charAt(i))) mp.put(s.charAt(i), -1);
            else mp.put(s.charAt(i), i);
        }
        for(char temp : s.toCharArray()){
            if(mp.get(temp) > -1) return mp.get(temp);
        }
        return -1;
        
    }
}