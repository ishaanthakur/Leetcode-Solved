/**You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself. */


/** Definition for singly-linked list. */


 public class ListNode {
    int val;
   ListNode next;
    ListNode(int x) { val = x; }
 }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode tot = new ListNode(0);
      
        ListNode res = tot;
        if(l1.val == 0 && l2.val ==0 && l1.next == null && l2.next == null) return tot;
        
  
        while(l1!=null && l2!=null){
           
            
            tot.val = (carry + l1.val +l2.val)%10;
            
            carry = (carry+l1.val+l2.val)/10;
          if(l1.next != null || l2.next!=null ) tot.next = new ListNode(0);
            if(l1.next == null && l2.next!=null) {l1.next = new ListNode(0);}
            if(l2.next == null && l1.next!=null){ l2.next =new ListNode(0);}
        if(l1.next == null && l2.next == null && carry !=0){
            tot.next = new ListNode(carry);
        }
            l1 = l1.next; 
            l2=l2.next; 
            tot = tot.next;
        }
        return res;
        
        
    }
}