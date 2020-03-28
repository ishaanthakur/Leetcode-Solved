/**You are given coins of different denominations and a total amount of money. 
 * Write a function to compute the number of combinations that make up that amount. 
 * You may assume that you have infinite number of each kind of coin. */


class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount +1 ];
        
       for(int i=0;i<=coins.length; i++){
           
        for(int j=0 ; j <= amount; j++){
            
                
                if(j==0) dp[i][j] = 1;
                else if (i==0) dp[i][j] = 0;
                else if (coins[i-1] > j ) dp[i][j] = dp[i-1][j];
                else dp[i][j] =dp[i-1][j] + dp[i][j-coins[i-1]];               
   
            }
        }
        return dp[coins.length][amount];
        
    }
}