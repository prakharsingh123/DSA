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
    public boolean isPalindrome(ListNode head) {
           
           Stack<Integer> stack = new Stack<>(); 

           if(head==null){
            return false;
           }
           ListNode curr = head;

           while( curr!=null){
             System.out.print(curr.val);
            stack.add(curr.val);

            curr = curr.next;
           
           }

           curr = head;

           while(curr.next!=null && !stack.isEmpty()){
        
            if(curr.val!=stack.pop()){
                return false;
            }
            curr = curr.next;
           }


    return true;
    }
}