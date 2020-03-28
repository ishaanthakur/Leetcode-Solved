/**Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements. */

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
    
    public HashSet<Integer> hs = new HashSet<>();
    public void traversal(TreeNode root){
        if(root == null) return;
        if(root != null) hs.add(root.val);
        traversal(root.left);
        traversal(root.right);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        traversal(root);
        int[] ret = new int[hs.size()];
        int i=0;
        for(int x : hs){
            ret[i] = x;
            i++;
        }
        Arrays.sort(ret);
        return ret[k-1];
        
    }
}