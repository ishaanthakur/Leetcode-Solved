/*8Given a singly linked list, group all odd nodes together followed by the even nodes. 
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.*/


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
    public:
        ListNode* oddEvenList(ListNode* head) {
            
           
            ListNode *odd = new ListNode(0);
            ListNode *even =new ListNode(0);
             ListNode *temp1 = odd;
            ListNode *temp2 = even;
            int temp = 0;
            while(head != NULL){
                if(temp % 2== 0){
                    odd->next= new ListNode(head->val);
                    odd = odd->next;
                }
                
                else{
                    even->next= new ListNode(head->val);
                    even = even->next;
                }
                temp++;
                head = head->next;
                
            }
            
            odd->next = temp2->next;
            return temp1->next;
            
            
        }
    };