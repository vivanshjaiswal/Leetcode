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
        //Brute Force Approach
        ListNode curr= head;
        ArrayList<Integer>result=new ArrayList<>();

        while(curr!=null){
        result.add(curr.val);
        curr=curr.next;
        }
       int n=result.size();
       int left=0;
       int right=n-1;
       while(left<=right){
        if(result.get(left)==result.get(right)) {         
            left++;
            right--;
        }
        else{
            return false;
        }
       }
       return true;
    }
}