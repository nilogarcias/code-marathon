package code.marathon.leetcode;

public class Problem2095DeleteMiddleNodeOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevMiddle = null;
        ListNode current = head;
        int countNodes = 0;
        int prevMiddleIdx = -1;

        while (current != null) {
            countNodes++;

            if (((countNodes / 2) - 1) > prevMiddleIdx) {
                prevMiddleIdx++;
                if (prevMiddle == null) {
                    prevMiddle = head;
                } else {
                    prevMiddle = prevMiddle.next;
                }
            }

            current = current.next;
        }

        if (prevMiddle == null) {
            return null;
        }

        // Skip the middle node
        prevMiddle.next = prevMiddle.next.next;

        return head;
    }
}
