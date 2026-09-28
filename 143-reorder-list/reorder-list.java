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
   
       ListNode curr = head;
    Stack<ListNode> stack = new Stack<>();

    while(curr!=null){
        stack.push(curr);
        curr= curr.next;
    }

    int k = stack.size()/2;

     curr = head;
         
         while(k>0){
               ListNode temp = curr.next;
         ListNode topNode = stack.pop();
         curr.next = topNode;
           curr = temp;
         topNode.next = temp;
       
         k--;
         }
        curr.next = null;

   

}
}