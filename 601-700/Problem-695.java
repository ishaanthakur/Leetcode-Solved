/**Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:

[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:

[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50.

 */

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            
            for(int j=0; j<grid[0].length; j++){
                
            arr.add(dfs(grid, i, j)); 
                
            }
        }
        
        return Collections.max(arr);
        
    }
    
    
    
    
    
    public int dfs(int[][] grid, int r, int c){
        if(r<0 || c < 0 || r>= grid.length||c>= grid[0].length|| grid[r][c] == 0){
            
            return 0;
        }
        System.out.println("r "+r + " c " + c);
        grid[r][c] = 0;
        
        return 1+ dfs(grid, r-1, c) + dfs(grid, r+1, c) + dfs(grid, r, c-1)+ dfs(grid, r, c+1);
         
        
        
        
        
    }
}