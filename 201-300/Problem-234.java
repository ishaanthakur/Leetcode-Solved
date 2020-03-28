/**Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> st = new Stack<>();  
        Queue<Integer> q = new LinkedList<>();
        while(head != null){
            st.push(head.val);
            q.add(head.val);
            head = head.next;
        }
       
        while(!st.isEmpty()){
            if(!st.pop().equals(q.remove())){
                return false;
            }
        }
        return true;
    }
    
}