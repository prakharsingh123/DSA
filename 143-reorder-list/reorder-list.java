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

         if(head == null || head.next == null) {
            return;
        }
    
     ListNode slow = head;
     ListNode fast = head;

     while(fast.next!=null && fast.next.next!=null){
         slow = slow.next;
         fast = fast.next.next;
     }
     ListNode newHead = reverse(slow.next);
     slow.next = null;

     ListNode curr = head;
     ListNode rev = newHead;


     while(rev!=null){
        ListNode tempRev = rev.next;
        ListNode temp = curr.next;
         curr.next = rev;
         rev.next = temp;
         curr = temp;
         rev = tempRev;

     }

    }
    public ListNode reverse(ListNode head){
        
    

        if(head==null || head.next==null){
            return head;
        }

            ListNode n = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return n;
    }
}