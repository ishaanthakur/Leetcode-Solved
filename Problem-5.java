/**Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000. */

class Solution {
    
    int start = 0; int maxlen = 0;
    public String longestPalindrome(String s) {
        if(s.length() < 2)return s;
        for(int i=0; i<s.length() - 1; i++){
            expand(s, i, i);
            expand(s, i, i+1);
        }
        return s.substring(start, start+maxlen);
        
    }
    
    
    public void expand(String s, int j, int k){
        
        while(j>=0 && k<s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        
        if(maxlen <k-j-1){
            start= j+1;
            maxlen = k-j-1;
        }
        
    }
}