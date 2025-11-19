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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode start=dummy;
        while(true){
            ListNode end=start;
            for(int i=0;i<k && end!=null;i++){
                end=end.next;
            }
            if(end==null) break;

            ListNode groupstart=start.next;
            ListNode nextgroup=end.next;
            end.next=null;
            ListNode reversedgroup=reverse(groupstart);

            start.next=reversedgroup;
            groupstart.next=nextgroup;
            start=groupstart;
        }
        return dummy.next;
    }
}