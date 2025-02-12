package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2130MaximumTwinSumOfLinkedListTest {
    private final Problem2130MaximumTwinSumOfLinkedList tested = new Problem2130MaximumTwinSumOfLinkedList();

    @Test
    void pairSumTestCase1() {
        ListNode head = ListNode.build(new int[]{5, 4, 2, 1});
        assertEquals(6, tested.pairSum(head));
    }

    @Test
    void pairSumTestCase2() {
        ListNode head = ListNode.build(new int[]{4, 2, 2, 3});
        assertEquals(7, tested.pairSum(head));
    }

    @Test
    void pairSumTestCase3() {
        ListNode head = ListNode.build(new int[]{1, 100_000});
        assertEquals(100_001, tested.pairSum(head));
    }
}