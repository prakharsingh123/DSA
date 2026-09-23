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

        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
      
       while(fast.next!=null && fast.next.next!=null){
          slow = slow.next;
          fast = fast.next.next;
       }

       ListNode newRev  = reverseList(slow.next);
       ListNode first = head;
       ListNode second = newRev;

       while(second!=null){
          if(first.val!=second.val){
            return false;
          }
          first = first.next;
          second  = second.next;
       }
         
       reverseList(newRev);
       return true;
        }


    public ListNode reverseList(ListNode head){
           
           if(head.next==null || head==null){
            return head;
           }
         
         ListNode newHead = reverseList(head.next);
          head.next.next = head;
          head.next = null;
    
        return newHead;
    }
}