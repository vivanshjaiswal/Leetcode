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

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) return head;

        // Dummy node to make handling head easier
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // start = previous group's end
        ListNode start = dummy;

        while (true) {
            ListNode end = start;

            // \U0001f539 Step 1: Move 'end' k nodes ahead to form a complete group
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }

            // Agar k nodes nahi mile, break (last group left as-is)
            if (end == null) break;

            // group start and next group start
            ListNode groupStart = start.next;
            ListNode nextGroupStart = end.next;

            // \U0001f539 Step 2: Break the group
            end.next = null;

            // \U0001f539 Step 3: Reverse the group
            ListNode reversedHead = reverse(groupStart);

            // \U0001f539 Step 4: Connect reversed group
            start.next = reversedHead;

            // Original groupStart ab reversed group ka tail ban chuka
            groupStart.next = nextGroupStart;

            // \U0001f539 Step 5: Move start to this group's tail
            start = groupStart;
        }

        return dummy.next;
    }

    // Standard reverse linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
