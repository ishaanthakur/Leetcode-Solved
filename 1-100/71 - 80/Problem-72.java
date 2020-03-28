/**Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character */

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word2.length()+1;
        int n = word1.length()+1;
        int[][] mem = new int[m][n];
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(i == 0){
                    mem[i][j] = j;
                    continue;
                }
                if(j == 0){
                    mem[i][j] = i;
                    continue;
                }
                
                if(word2.charAt(i-1) == word1.charAt(j-1)){
                    mem[i][j] = mem[i-1][j-1];
                }else{
                    int replaceDistance = mem[i-1][j-1]+1; 
                    // ED("ABC", "DEF") = ED("AB", "DE") + 1 
                    // conversion from "AB" to "DE"
                    // one operation to replace C with F
                    
                    int insertDistance = mem[i][j-1]+1; 
                    // ED("ABC", "DEF") = ED("ABC", "DE") + 1
                    // conversion from ABC to DE
                    // one operation to insert F
                    
                    int deleteDistance = mem[i-1][j]+1; 
                    // ED("ABC", "DEF") = ED("AB", "DEF") + 1
                    // one operation to delete C
                    // conversion from AB to DEF
                    
                    mem[i][j] = Math.min(Math.min(replaceDistance, insertDistance), deleteDistance);
                }
            }
        }
        
        
        return mem[m-1][n-1];
    } 
}