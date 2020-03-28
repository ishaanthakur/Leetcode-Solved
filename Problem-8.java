/**Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. */

import java.util.*;

class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        
        int i = 0;
        while(i < str.length() && str.charAt(i) == ' ') i++;
        
        int sign = 1;
        if(i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        }  
        
        long count = 0;
        while(i < str.length()) {
            if(!Character.isDigit(str.charAt(i))) {
                break;
            }
            
            count = count * 10 + str.charAt(i++) - '0';
            if(count * sign > Integer.MAX_VALUE || count * sign < Integer.MIN_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        
        return (int) (count * sign);
    }
}