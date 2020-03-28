/**Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:

[
  [3],
  [20,9],
  [15,7]
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      if (root == null) {
        return new ArrayList<List<Integer>>();
      }
  
      List<List<Integer>> results = new ArrayList<List<Integer>>();
  
      // add the root element with a delimiter to kick off the BFS loop
      Queue<TreeNode> node_queue = new LinkedList<TreeNode>();
      node_queue.add(root);
      node_queue.add(null);
  
      LinkedList<Integer> level_list = new LinkedList<Integer>();
      boolean is_order_left = true;
  
      while (node_queue.size() > 0) {
        TreeNode curr_node = node_queue.poll();
        if (curr_node != null) {
          if (is_order_left)
            level_list.addLast(curr_node.val);
          else
            level_list.addFirst(curr_node.val);
  
          if (curr_node.left != null)
            node_queue.add(curr_node.left);
          if (curr_node.right != null)
            node_queue.add(curr_node.right);
  
        } else {
          // we finish the scan of one level
          results.add(level_list);
          level_list = new LinkedList<Integer>();
          // prepare for the next level
          if (node_queue.size() > 0)
            node_queue.add(null);
          is_order_left = !is_order_left;
        }
      }
      return results;
    }
  }