/**Given a binary tree, return the inorder traversal of its nodes' values. */

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
    
    public void inorder(TreeNode root, List<Integer> ll){
        
        if(root == null) return;
        inorder(root.left, ll);
       ll.add( root.val);
        inorder(root.right, ll);
        
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll = new LinkedList<Integer>();
        
     inorder(root,ll);
        
        return ll;
    }
}