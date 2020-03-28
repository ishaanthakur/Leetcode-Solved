/**Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 

Constraints:

1 <= n <= 1000 */


class Solution {
    public int[] sumZero(int n) {
        
        if(n==0) return null;
        if(n==1) return new int[]{0};
        int[] ret = new int[n];
        if(n%2!=0) ret[(int)n/2] = 0;
        for(int i=0; i<n/2; i++){
            ret[i] = i+1;
            ret[(int)n/2 +i] = -(i+1);
        }
        return ret;
    }
}