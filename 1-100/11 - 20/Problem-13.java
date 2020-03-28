/**Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999. */


import java.util.*;

public class Solution {

    public int romanToInt(String s) {
        if(s == null){
            return 0;
        }
        
        int length = s.length();
        int sum = 0;
        int pre = 0;
        
        for(int i = length - 1; i >= 0; i--){
            int cur = romanTable(s.charAt(i));
            
            if(i == length - 1){
                sum = sum + cur;
            }else{
               if(cur < pre){
                   sum = sum - cur;
               }else{
                   sum = sum + cur;
               }
            }
            pre = cur;
        }
        
        return sum;
    }
    
    public int romanTable(char c){
        int num = 0;
        switch(c){
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
             case 'X':
                num = 10;
                break;
             case 'L':
                 num = 50;
                 break;
             case 'C':
                 num = 100;
                 break;
             case 'D':
                 num = 500;
                 break;
             case 'M':
                 num = 1000;
                 break;
             default:
                 num = 0;
                 break;
        }
        return num;
        }
    }