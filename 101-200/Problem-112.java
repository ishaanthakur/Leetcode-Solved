/**Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22. */

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
    
    public boolean dfs(TreeNode root, int count , int sum){
        if(root.right == null && root.left ==null) return count == sum;
        boolean l =false; boolean r = false;
        if(root.right !=null) r= dfs(root.right, count+root.right.val, sum);
        if(root.left !=null) l= dfs(root.left, count+root.left.val, sum);
        return l || r;
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return dfs(root, root.val, sum);
    }
}