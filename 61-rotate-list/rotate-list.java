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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Count length of the list
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        k = k % len; // handle k > length
        if (k == 0) return head;

        for (int i = 0; i < k; i++) {
            ListNode prev = null;
            ListNode curr = head;

            // Traverse to last node
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

            // Move last node to head
            curr.next = head;
            prev.next = null;
            head = curr;
        }

        return head;
    }
}
