/**Given the root of a binary tree with N nodes, each node in the tree has node.val coins, and there are N coins total.

In one move, we may choose two adjacent nodes and move one coin from one node to another.  (The move may be from parent to child, or from child to parent.)

Return the number of moves required to make every node have exactly one coin. */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int ret;
    public int distributeCoins(TreeNode root){
       ret =0;
        dfs(root);
        return ret;
        
        
    }
    
    public int dfs(TreeNode root){
        if(root ==null) return 0;
        int left = dfs(root.left); int right = dfs(root.right);
        ret += Math.abs( left) + Math.abs(right);
        return root.val + left+right-1;
        
    }
}

