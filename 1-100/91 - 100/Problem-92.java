/**Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

 */


 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    private ListNode left;
    private boolean stop;
    public void recursereverse(ListNode right, int m , int n){
        
    if(n ==1) return ;
            right = right.next;
        if(m> 1)left =left.next;
        recursereverse(right, m-1, n-1);
        
        if(left == right || right.next == left) stop = true;
        if(!stop){
            int t= left.val;
            left.val = right.val;
            right.val = t;
            left = left.next;
        }
        
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        left =head;stop = false;
        recursereverse(head,m,n);
        return head;
        
    }
}