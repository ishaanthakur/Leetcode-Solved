/*8Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. 
The binary tree has the same structure as a full binary tree, but some nodes are null.

The width of one level is defined as the length between the end-nodes (
    the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also 
    counted into the length calculation.*/
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
    int max = 1;
    int tracker =0;
  public int BFS(TreeNode root){
    LinkedList<TreeNode> Q = new LinkedList<>();
    Q.add(root);
    int size =1;
    while(Q.size()>0){
        TreeNode temp = Q.remove(0);
        size--;
        if(temp == null){
            Q.add(null); Q.add(null);
        }
        else{Q.add(temp.left);Q.add(temp.right);}
        if(size==0){
            boolean brk = false;
 while(Q.get(0) == null || Q.get(Q.size()-1) == null){
            if(Q.get(0) == null){Q.remove(0);}
             if(Q.get(Q.size()-1) == null){Q.remove(Q.size()-1);}
            if(Q.size()== 0){
                brk = true; break;
            }
     }
            if(brk) break;
            max = Math.max(max, Q.size());
            
            size = Q.size();
        }  
    }
    return max;
    
    
}
    public int widthOfBinaryTree(TreeNode root) {   
        if(root == null) return 0;
        if(root.left==null && root.right == null) return 1;
        return BFS(root);
        
        
        
        
        
    }
}