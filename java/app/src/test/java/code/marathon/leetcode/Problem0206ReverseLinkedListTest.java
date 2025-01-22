package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0206ReverseLinkedListTest {
    private final Problem0206ReverseLinkedList tested = new Problem0206ReverseLinkedList();

    private void assertLinkedList(ListNode head, int... expectedValues) {
        ListNode current = head;
        for (int expectedValue : expectedValues) {
            assertNotNull(current);
            assertEquals(expectedValue, current.val);
            current = current.next;
        }
    }

    @Test
    void reverseListTestCase1() {
        assertLinkedList(tested.reverseList(ListNode.build(new int[]{1, 2, 3, 4, 5})), 5, 4, 3, 2, 1);
    }

    @Test
    void reverseListTestCase2() {
        assertLinkedList(tested.reverseList(ListNode.build(new int[]{1, 2})), 2, 1);
    }

    @Test
    void reverseListTestCase3() {
        assertNull(tested.reverseList(null));
    }
}