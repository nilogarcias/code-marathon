package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/odd-even-linked-list/description">328. Odd Even Linked List</a>
 * Complexity: O(n)
 * Space: O(1)
 */
public class Problem0328OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode currOdd = head;
        ListNode tailOdd = currOdd;
        ListNode headEven = head.next;
        ListNode currEven = headEven;
        while (currOdd != null) {
            if (currEven != null) {
                currOdd.next = currEven.next;
                currEven.next = (currEven.next != null) ? currEven.next.next : null;
                currEven = currEven.next;
            } else {
                currOdd.next = null;
            }

            tailOdd = currOdd;
            currOdd = currOdd.next;
        }

        // Linking both lists
        tailOdd.next = headEven;

        return head;
    }
}
