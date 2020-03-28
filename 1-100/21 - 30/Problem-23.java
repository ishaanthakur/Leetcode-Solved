/**Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode x : lists){
            while(x!=null){
                arr.add(x.val);
                x = x.next;
            }
        }
        Collections.sort(arr);
        ListNode ret = new ListNode(0);
        ListNode temp = ret;
        for(int x : arr){
            temp.next = new ListNode(x);
            temp =temp.next;
        }
        return ret.next;
        
    }
}