/**Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only. */
class Solution {
    public int lengthOfLastWord(String s) {
        
    int cnt =0;
    s=s.trim();
    int tot =s.length();
    if( tot ==0){
            cnt =0;
    }

    else{
        
        String[] a=s.split(" ");
        cnt =a[a.length-1].length();
       }
    
       return cnt;
        
     
    }
}