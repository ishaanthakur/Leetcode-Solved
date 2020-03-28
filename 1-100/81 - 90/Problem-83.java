/**Given a sorted linked list, delete all duplicates such that each element appear only once. */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    HashSet<Integer> hs = new HashSet<>();
        while(head != null) {hs.add(head.val);
        head = head.next;}
        
        ListNode temp = new ListNode(0);
        ListNode ret = temp;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : hs) arr.add(i);
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }
        return ret.next;
        
    }
}