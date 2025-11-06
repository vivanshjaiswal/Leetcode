class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: agar koi list null hai to dusri return kar do
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Step 2: pehli list ke end tak jao
        ListNode ptr = list1;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        // Step 3: second list ko link karo
        ptr.next = list2;

        // Step 4: ab poori merged list ko sort karo (bubble sort approach for linked list)
        ListNode current = list1;
        while (current != null) {
            ListNode index = current.next;
            while (index != null) {
                if (current.val > index.val) {
                    int temp = current.val;
                    current.val = index.val;
                    index.val = temp;
                }
                index = index.next;
            }
            current = current.next;
        }

        // Step 5: sorted merged list return
        return list1;
    }
}
