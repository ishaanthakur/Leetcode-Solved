/**In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins. */


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


	private int dx;
	private TreeNode px;
	private TreeNode py;
	private int dy;



public void preorder(TreeNode root, int x, int y, TreeNode p, int depth ){
	if(root == null) return;
	if(root.val == x){
		px = p;
		dx = depth;
	}
	if(root.val == y){
		py = p;
		dy = depth;
	}
	preorder(root.left, x, y, root, depth+1);
	preorder(root.right, x, y, root, depth+1);

}

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;

        preorder(root, x, y, root, 0);
        return px!=py && dx==dy;





    }
}