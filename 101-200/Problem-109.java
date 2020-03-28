/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
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
    
    public TreeNode traversal(int[] arr, int l , int r){
        if(l > r || arr.length < 1) return null;
        int mid = ((l+r +1 )/2);
        TreeNode root = new TreeNode(arr[mid]);
        root.left = traversal(arr, l, mid-1);
        root.right = traversal(arr, mid+1, r );
        return root;

        
    }
    
  
    
    public TreeNode sortedListToBST(ListNode head) {
            ListNode temp = head;
            int count = 0;
        while(temp != null){count++; temp = temp.next;}
        int[] arr = new int[count];
       
        int i=0;
        while(head != null ) {arr[i] = head.val; head = head.next; i++; }
        
        
        
        return traversal(arr, 0, count-1);
            
    }
}