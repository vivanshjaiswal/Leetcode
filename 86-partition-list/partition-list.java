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
    public ListNode partition(ListNode head, int x) {
        ListNode smallhead=new ListNode(0);
        ListNode bighead=new ListNode(0);
        ListNode small=smallhead;
        ListNode big=bighead;
        ListNode curr=head;
    while(curr!=null){
        if(curr.val<x){
            small.next=curr;
            small=small.next;
        }
         else {
            big.next=curr;
            big=big.next;
        }
  curr=curr.next;
    }
big.next=null;
 small.next = bighead.next;

        return smallhead.next;
    }
}