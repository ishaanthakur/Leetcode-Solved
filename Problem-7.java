/**Given a 32-bit signed integer, reverse digits of an integer. */

import java.util.*;
class Solution {
    public int reverse(int x) throws NumberFormatException {
      try{  int flag = 0;
        if(x<0) {flag = 1; x=x*(-1);}
        String str = Integer.toString(x);
        String str2="";
        for(int i =0 ;i<str.length(); i++){
            str2 += String.valueOf(str.charAt(str.length()-1-i));
            
        }
        if(str2 == "" ) return 0;
        else { if(flag == 0) return Integer.parseInt(str2);
              else return Integer.parseInt(str2)*(-1);
              
             }
         }   
        catch (NumberFormatException nfe){
            return 0;
        }
    }
}