/**Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:

[
  [15,7],
  [9,20],
  [3]
] */

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
             List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ll;
        q.add(root);
   
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode r = q.poll();
                temp.add(r.val);
                if(r.left != null) q.add(r.left);
                if(r.right != null) q.add(r.right);
            }
            ll.add(0, temp);
            
            
        }
        return ll;
        
    }
}