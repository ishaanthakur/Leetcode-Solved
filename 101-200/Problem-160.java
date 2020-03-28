/**Write a program to find the node at which the intersection of two singly linked lists begins. */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode temp2 = headB;
        HashSet<ListNode> hs = new HashSet<>();
        while(temp !=null){
            hs.add(temp);
            temp = temp.next;
        }
        while(temp2 !=null){
            if(hs.contains(temp2)) return temp2;
            temp2 = temp2.next;
        }
        return null;
    }
    
        
}