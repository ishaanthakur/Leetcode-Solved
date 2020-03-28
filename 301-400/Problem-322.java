/**You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1. */

class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int ret[] = new int[amount+1];
        Arrays.fill(ret, amount+100);
        ret[0] = 0;
        
       for(int i=1; i<= amount; i++){
           for(int j=0; j<coins.length ; j++){
               
           if(coins[j] <= i) ret[i] = Math.min(ret[i], ret[i-coins[j]] + 1);
 
           }
           
       }
        
        System.out.println(ret[amount]);
        return ret[amount] > amount ? -1 :ret[amount] ;
        
    }
}