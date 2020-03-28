/**Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef". */

class Solution {
    public String decodeString(String s) {
        if(s.length()==0) return "";

        if(s.charAt(0)<'0' || s.charAt(0)>'9')
            return s.charAt(0) + decodeString(s.substring(1));

        int t=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' && t++==0) start=i;
            if(s.charAt(i)==']' && --t==0) {end=i; break;}
        }

        String res = new String("");
        for(int j=0;j<Integer.valueOf(s.substring(0,start));j++)
            res += decodeString(s.substring(start+1,end));
        return res + decodeString(s.substring(end+1));
    }
}


