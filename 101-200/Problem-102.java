/**Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]
 */

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr= new ArrayList<>();
   
        
        
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        if(root == null) return arr;
     
        while(q.size() != 0){
        int q_size = q.size();
         List<Integer> arr_temp = new ArrayList<>();
        
            for(int i=0; i<q_size; i++){
                TreeNode hello = q.poll();
                if(hello != null && hello.left != null) q.add(hello.left);
                if(hello != null && hello.right != null)q.add(hello.right);
                if(hello != null)arr_temp.add(hello.val);
            
                
            }
         
            arr.add(arr_temp);
            
        }
        return arr;
    }
}