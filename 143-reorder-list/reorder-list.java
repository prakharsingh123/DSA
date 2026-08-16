/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode curr = head;
        while(curr!=null){
           stack.push(curr);
           curr = curr.next;
        }

        curr = head;

         int size = stack.size();

         for(int i=0;i<size/2;i++){

            ListNode last = stack.pop();
            ListNode next = curr.next;

            // curr anhi head pr hai 
            // curr.next last wale ko pakdega 

            curr.next = last;
            last.next = next;

            curr = next;
           


         }

         curr.next = null;

    }
}