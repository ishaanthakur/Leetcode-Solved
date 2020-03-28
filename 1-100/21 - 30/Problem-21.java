/**Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode ll = ret;
        
        while(l1!=null && l2!=null){
            if(l1.val > l2.val){
                ret.next = new ListNode(l2.val);
                ret = ret.next;
                l2 = l2.next;
            }
            else{
                ret.next = new ListNode(l1.val);
                ret = ret.next;
                l1 = l1.next;
            }
            
            
        }
        
        if(l1 == null && l2 != null){
            while(l2!= null){
                ret.next = new ListNode(l2.val);
                ret = ret.next;
                l2 = l2.next;
                
            }
        }
        if(l1!= null && l2 == null){
            while(l1!= null){
                ret.next = new ListNode(l1.val);
                ret = ret.next;
                l1 = l1.next;
                
            }
        }
        return ll.next;
    }
}