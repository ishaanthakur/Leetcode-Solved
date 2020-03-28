/** Given a sorted linked list, delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list. 
 * Return the linked list sorted as well.*/

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
        HashMap<Integer, Integer> mp = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
        if(mp.containsKey(temp.val))mp.put(temp.val, mp.get(temp.val) + 1);
            else mp.put(temp.val, 1);
            temp =temp.next;
            
        }
        System.out.println(mp.entrySet());
        if(mp.size() == 0) return null;
        ListNode ret = new ListNode(0);
        ListNode ret2 = ret;
        ListNode inc = head;
    
        while(inc != null){
            if(mp.get(inc.val) == 1){
                ret2.next = new ListNode(inc.val);
                ret2 = ret2.next;
            }
            inc = inc.next;
        }
        return ret.next;
        
    }
}