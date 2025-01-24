package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2095DeleteMiddleNodeOfLinkedListTest {
    private final Problem2095DeleteMiddleNodeOfLinkedList tested = new Problem2095DeleteMiddleNodeOfLinkedList();

    private void assertLinkedList(ListNode expectedList, ListNode list) {
        assertNotNull(list);
        while (list != null) {
            assertNotNull(expectedList);
            assertEquals(expectedList.val, list.val);
            list = list.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    void deleteMiddleTestCase1() {
        ListNode head = ListNode.build(new int[]{1, 3, 4, 7, 1, 2, 6});
        ListNode expected = ListNode.build(new int[]{1, 3, 4, 1, 2, 6});

        assertLinkedList(expected, tested.deleteMiddle(head));
    }

    @Test
    void deleteMiddleTestCase2() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4});
        ListNode expected = ListNode.build(new int[]{1, 2, 4});

        assertLinkedList(expected, tested.deleteMiddle(head));
    }

    @Test
    void deleteMiddleTestCase3() {
        ListNode head = ListNode.build(new int[]{2, 1});
        ListNode expected = new ListNode(2);

        assertLinkedList(expected, tested.deleteMiddle(head));
    }

    @Test
    void deleteMiddleTestCase4() {
        assertNull(tested.deleteMiddle(null));
    }

}