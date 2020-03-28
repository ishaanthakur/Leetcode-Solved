/**Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
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
    public void deleteNode(ListNode node) {
        
        ListNode temp = node;
        node.val = temp.next.val;;
        node.next = temp.next.next;
        
        
    }
}