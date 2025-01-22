package code.marathon.leetcode;

import java.util.Stack;

public class Problem0206ReverseLinkedList {

    // O(n)
    private ListNode reverseListWithStack(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> nodes = new Stack<>();
        ListNode node = head;
        while (node != null) {
            nodes.push(node);
            node = node.next;
        }

        ListNode newHead = null;
        if (!nodes.isEmpty()) {
            newHead = nodes.pop();
        }

        node = newHead;
        while (!nodes.isEmpty()) {
            node.next = nodes.pop();
            node = node.next;
        }
        node.next = null;

        return newHead;
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
