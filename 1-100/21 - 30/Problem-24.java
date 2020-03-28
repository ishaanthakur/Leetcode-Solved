/**Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null) return head;

        
        ListNode temp = head;
      
        ListNode ret =head;
       
        while(temp!=null){
            
            if(temp.next==null)  break;
            
            else{
                    int g = temp.val;
                    head.val = temp.next.val;
                    head = head.next;
                    head.val = g;
                    head = head.next;

                if(temp.next.next == null) temp = null;
           
                else temp = temp.next.next;

            }

        }        
        return ret;
        
    }
}