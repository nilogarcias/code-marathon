package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0215KthLargestElementArrayTest {
    private final Problem0215KthLargestElementArray tested = new Problem0215KthLargestElementArray();

    @Test
    void findKthLargestTestCase1() {
        assertEquals(5, tested.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void findKthLargestTestCase2() {
        assertEquals(4, tested.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}