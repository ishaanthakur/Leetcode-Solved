/**Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children. */

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
    
    public static List<String> ret ;
    public void dfs(TreeNode root, String prev){
        if (root == null) return ;
        String curr = "" + root.val;
        dfs(root.left, prev+curr+"->");
          dfs(root.right, prev+curr+"->");
        if(root.left == null && root.right == null){
            ret.add(prev + curr);
            prev = "";
        }
        
        
    }
  
    
    
    public List<String> binaryTreePaths(TreeNode root) {
        ret = new ArrayList<>();
        if(root == null) return ret;
        dfs(root, "");
        
        return ret;
        
        
        
    }
}