/**Given a linked list, remove the n-th node from the end of list and return its head. */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode sec = head;
        ListNode temp = head;
        int tot = 0;
        while(temp != null){
            tot++;
            temp = temp.next;
        }
        int ind = tot -n;
        if(ind== 0) return head.next;
        sec = sec.next.next;
        
    
        for(int i= 0; i<ind-1; i++) {
         first = first.next; sec = sec.next;
              
        }
        first.next = sec;
    
        return head;
        
        
    }
}