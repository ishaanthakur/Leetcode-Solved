/**Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        if(arr.size() == 0) return null;
        ListNode ret = new ListNode(arr.get(arr.size()-1));
        ListNode temp = ret;
        for(int i=1; i<arr.size(); i++){
            ret.next = new ListNode(arr.get(arr.size()-1-i));
            ret = ret.next;
        }
        
        
        return temp;
    }
}