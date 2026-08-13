/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
         ListNode fast = head;
        ListNode slow = head;

        if(head==null){
            return null;
        }

        while(fast!=null && fast.next!=null){
   /// pehele move krana hai tb tk move krao jb tk wo mil nhi jaate 
   // ek baar cycle me milenge 
   // fir hum slow = head pr krdenge reset 
   // fir jb tk dubara nhi milte fir dono ko move kraynge and wahi pont hoga cycle ka
            
           slow = slow.next;
           fast = fast.next.next;

           if(slow==fast){
             slow  = head;
             
             while(slow!=fast){
                slow = slow.next;
             fast = fast.next;
             }

             if(slow==fast){
                return slow;
             }
           }


        }

        return null;
        
    }
}