/**Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it. */


class Solution {
    public int addDigits(int num) {
        
        String str ="";
        str=""+ num;
        if(str.length() == 1) return Integer.parseInt(str);
        else {
            num =0;
            for(char s:str.toCharArray()){
              
                num +=Integer.parseInt(""+s);
                
            }
              System.out.println(num);

            return addDigits(num);
        }
        
    }
} 
