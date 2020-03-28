/**Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings. */

class Solution {
    public int balancedStringSplit(String s) {
        
        
        int cnt = 0;
        int cntL = 0; int cntR = 0;
        if(s.length() == 0) return 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L') cntL++;
            else cntR++;
            if(cntL==cntR) {
                cnt++;
                cntL=0;
                cntR=0;
            }
        }
        return cnt;
        
    }
}