/**Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree. */

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
    
    
    public int MaxIndex(int[] nums){
    int max = nums[0]; int ret = 0;
    for(int i=0; i<nums.length ; i++) {
        if(nums[i] > max) {
            max= nums[i]; ret = i;
    }
}
        return ret;
    }

public TreeNode constructMaximumBinaryTree(int[] nums) {
    
    if(nums== null || nums.length == 0 ) return null;

        if(nums.length == 1) return new TreeNode(nums[0]);

        int max = MaxIndex(nums);

        TreeNode ret = new TreeNode(nums[max]);
        if(max == 0) {
            ret.right = constructMaximumBinaryTree( Arrays.copyOfRange(nums, 1, nums.length));
        }
        else if(max == nums.length -1 ){
            ret.left =  constructMaximumBinaryTree( Arrays.copyOfRange(nums, 0, nums.length-1));
        }

        else{
            ret.left = constructMaximumBinaryTree( Arrays.copyOfRange(nums, 0, max));
            ret.right = constructMaximumBinaryTree( Arrays.copyOfRange(nums, max+1, nums.length));
        }

            return ret;
  
    
}
}