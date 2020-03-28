/**Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n? */

class Solution {
    public int numTrees(int n) {
        if(n == 1 || n == 0) return 1;
        
        int res = 0;
        for(int i=1; i<=n; i++){
           res += numTrees(i-1)*numTrees(n-i);
            
            
        }
        return res;
        
    }
}