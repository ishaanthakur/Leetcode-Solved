/**Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

    1
   / \
  2   5
 / \   \
3   4   6
The flattened tree should look like:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6 */

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
    public void flatten(TreeNode root) {
    
  Stack<TreeNode> nodes = new Stack<TreeNode>();
        if (root != null) {
            nodes.push(root.right);
            nodes.push(root.left);
        }
        while (!nodes.empty()) {
            TreeNode curr = nodes.pop();
            if (curr != null) {
                nodes.push(curr.right);
                nodes.push(curr.left);
                root.left = null;
                root.right = curr;
                root = root.right;
            }
        }
        
    }
}          