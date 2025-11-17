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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        //edge case if first node is the deletion node

        if(n==size){
            return head.next;
        }
        int steps=size-n;
        ListNode curr=head;
        ListNode prev=null;
        while(steps>0){
            prev=curr;
            curr=curr.next;
            steps--;

        }
prev.next=curr.next;
return head;    
   }
}