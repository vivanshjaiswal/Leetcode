/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lenA = 0, lenB = 0;
        ListNode a = headA, b = headB;

        while (a != null) {
            lenA++;
            a = a.next;
        }
        while (b != null) {
            lenB++;
            b = b.next;
        }

        
        a = headA;
        b = headB;

        if (lenA > lenB) {
            int diff = lenA - lenB;
            for (int i = 0; i < diff; i++) a = a.next;
        } else {
            int diff = lenB - lenA;
            for (int i = 0; i < diff; i++) b = b.next;
        }

                while (a != b) {
            a = a.next;
            b = b.next;
        }

        
        return a;
    }
}
