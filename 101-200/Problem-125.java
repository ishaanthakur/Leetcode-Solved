/**Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false */

class Solution {
    public boolean isPalindrome(String s) {
        String str1 = s.trim().toUpperCase();
        String str="";
        for(Character i : str1.toCharArray()){
            if(Character.isDigit(i) || Character.isLetter(i)) str+= i;
        }
        int i=0; int j =str.length()-1;
        // System.out.println(str.length());
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
}