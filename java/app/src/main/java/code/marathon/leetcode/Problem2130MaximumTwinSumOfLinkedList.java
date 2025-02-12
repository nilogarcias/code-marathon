package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list">2130. Maximum Twin Sum Of a Linked List</a>
 * Complexity: O(n)
 * Space: O(1)
 */
public class Problem2130MaximumTwinSumOfLinkedList {
    public int pairSum(ListNode head) {
        ListNode newList = null;
        ListNode temp;
        ListNode current = head;
        ListNode currSecondHalf = head;

        while (currSecondHalf != null && currSecondHalf.next != null) {
            currSecondHalf = currSecondHalf.next.next;

            temp = current.next;
            current.next = newList;
            newList = current;

            current = temp;
        }

        int maxTwinSum = 0;
        while (current != null && newList != null) {
            maxTwinSum = Math.max(maxTwinSum, current.val + newList.val);
            current = current.next;
            newList = newList.next;
        }

        return maxTwinSum;
    }
}
