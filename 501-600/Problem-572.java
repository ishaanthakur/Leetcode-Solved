/**Given two non-empty binary trees s and t, check whether tree t has exactly the same structure 
 * and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. 
 * The tree s could also be considered as a subtree of itself. */


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
    public boolean issame(TreeNode s, TreeNode t){
     if(s==null && t==null) return true;
    if(s!=null && t!=null)return(s.val == t.val && issame(s.left, t.left) && issame(s.right, t.right));
        return false;
    }
    
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t==null) return true;
        else if(s==null ) return false;
   return (issame(s,t) || isSubtree(s.left, t)|| isSubtree(s.right, t));
   }


 
        
    
}