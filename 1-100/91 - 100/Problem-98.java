/** Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees. */


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
    
    public boolean foo(TreeNode root, Integer min, Integer max){
        
        if(root == null) return true;
        if(min != null && root.val >= min) return false;
        if(max != null && root.val <= max) return false;
        
        return foo(root.left,root.val, max ) && foo(root.right, min, root.val );
        
        
    }
    
    
    public boolean isValidBST(TreeNode root) {
        
        return foo(root, null, null);
        
    }
}