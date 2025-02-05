package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0328OddEvenLinkedListTest {
    private final Problem0328OddEvenLinkedList tested = new Problem0328OddEvenLinkedList();

    private void assertLinkedList(int[] expectedValues, ListNode head) {
        ListNode currNode = head;
        for (int expectedValue : expectedValues) {
            assertNotNull(currNode);
            assertEquals(expectedValue, currNode.val);
            currNode = currNode.next;
        }
    }

    @Test
    void oddEvenListTestCase1() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        int[] expectedValues = {1, 3, 5, 2, 4};
        assertLinkedList(expectedValues, tested.oddEvenList(head));
    }

    @Test
    void oddEvenListTestCase2() {
        ListNode head = ListNode.build(new int[]{2, 1, 3, 5, 6, 4, 7});
        int[] expectedValues = {2, 3, 6, 7, 1, 5, 4};
        assertLinkedList(expectedValues, tested.oddEvenList(head));
    }

    @Test
    void oddEvenListTestCase3() {
        ListNode head = ListNode.build(new int[]{2, 1, 3, 5, 6, 4, 7, 9});
        int[] expectedValues = {2, 3, 6, 7, 1, 5, 4, 9};
        assertLinkedList(expectedValues, tested.oddEvenList(head));
    }
}