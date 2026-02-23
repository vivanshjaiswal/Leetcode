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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        dummy.next=head;
       
        while(prev.next!=null && prev.next.next!=null){
             ListNode Curr=prev.next;
             ListNode Next=Curr.next;
            Curr.next=Next.next;
            Next.next=Curr;
            prev.next=Next;

            prev=Curr;
           
        }
        return dummy.next;
    }
}