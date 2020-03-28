/**Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

Search for a node to remove.
If the node is found, delete the node.
Note: Time complexity should be O(height of tree). */

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
    
    

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val== key) return merge(root.left, root.right);
        else if (root.val > key) root.left = deleteNode(root.left, key);
        else if (root.val < key) root.right = deleteNode(root.right, key);
        return root;
        
        
        
    }
    
    
    
    public TreeNode merge(TreeNode leftn, TreeNode rightn){
        if(leftn==null) return rightn;
        else if (rightn == null) return leftn;
        TreeNode it = rightn;
        while(it.left !=null) it = it.left;
        it.left = leftn;
        return rightn;
        
    }
}