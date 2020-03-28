/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 */


class Solution {
    public double myPow(double x, int n) {
        
        if(n==0) return 1;
        if(n==1) return x;
       
        int temp =n/2;
        if(n<0) {
            temp = -temp;
            x=1/x;
        
        }
        
        double ret = myPow(x,temp);
        if(n%2 == 0) return ret*ret;
        else return ret*ret*x;
        
    }
}