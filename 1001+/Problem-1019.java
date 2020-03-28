/**We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.

Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val, and j is the smallest possible choice.  If such a j does not exist, the next larger value is 0.

Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).

Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the serialization of a linked list with a head node value of 2, second node value of 1, and third node value of 5.

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
    public int[] nextLargerNodes(ListNode head) {

    	ListNode temp = head;
    	ArrayList<Integer> arr = new ArrayList<>();
    	while(temp != null){
    		arr.add(temp.val);
    		temp = temp.next;
    	}

    	int[] a = new int[arr.size()];
    	for(int i=0; i<arr.size(); i++){
    		a[i] = arr.get(i);
    	}
   
    	int[] temp2 = new int[a.length];

    	for(int i=0; i<a.length; i++){
    		for(int j=i; j<a.length; j++){
    			if(a[j] > a[i]) {
    				temp2[i] = a[j];
    				break;
    			}
    		}
    	}
    	return temp2;
        
    }
}