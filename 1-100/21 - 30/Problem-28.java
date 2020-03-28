/**Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int res = -1;
        int fl =0;
        if(needle.length()>haystack.length()) return -1;
        for(int i =0; i<haystack.length(); i++){
            
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needle.length() == 1) {res = i; break;}
                int temp = res;
                for(int j =0; j<needle.length(); j++){
                if(j+i<haystack.length()){
                    if(haystack.charAt(j+i) == needle.charAt(j)){ res = i; fl =1;}
                else {res = temp; fl=0; break;}
                 }
                    else return -1;
                }
                if(fl ==1)   break;
            }
            
            
        }
        
        return res;
        
        
    }
}