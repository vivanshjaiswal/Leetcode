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
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
        ListNode slow=head;
        ListNode fast= head.next;
        while(slow!=null && fast!=null){
            slow.next=fast.next;
            fast.next=slow;
            prev.next=fast;

            prev=slow;
            slow=slow.next;
            if(slow!=null) fast=slow.next;
        }
   return dummy.next; }
}