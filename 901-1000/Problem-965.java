/**A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued. */

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
    int fl =0;
    public void inorder(TreeNode root, int x){
        if(root == null ) return;
        inorder(root.left,x);
        inorder(root.right,x);
        if(root!= null && root.val!=x) fl+= 1;
       
        
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int x = root.val;
        
        inorder(root,x);
        if(fl >0) return false;
        else return true;
    }
}