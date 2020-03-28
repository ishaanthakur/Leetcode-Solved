/**Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl" 
*/

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String arr = strs[0];
        for(int i =1 ;i<strs.length; i++){
            while(strs[i].indexOf(arr) != 0) {
                arr = arr.substring(0, arr.length()-1);
            }
        }
        return arr;
    }
}