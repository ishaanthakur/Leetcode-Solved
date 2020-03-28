/**Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned. */

class Solution {
    public int mySqrt(int x) {
        
        if( x== 0 || x==1) return x;
        double temp = 1;
        double i =1;
        while (temp<x ) {
            i++;
            temp = i*i;
        }
        if(temp>x){
            return (int) i-1;
        }
        return (int)i;
        
    }
}