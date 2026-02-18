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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=list1;
        ListNode temp1=null;
        int c=0;
        ListNode temp2=null;
        while(curr!=null){
            if(c==a-1){
                temp1=curr;
            }
            if(c==b+1){
                temp2=curr;
                break;
            }
            curr=curr.next;
            c++;

        }
        temp1.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp2;
        return list1;
        
    }
}