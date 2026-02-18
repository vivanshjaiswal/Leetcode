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
    public ListNode reverse(ListNode ptr){
    ListNode curr=ptr;
    ListNode prev=null;
    ListNode next=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle = slow;
        ListNode head1=reverse(middle);
        ListNode temp1=head1;
        ListNode temp2=head;
        while(temp1!=null){
            if(temp1.val==temp2.val){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else{
                return false;
            }
        }
        return true;



        
        
    }
}