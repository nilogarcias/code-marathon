package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0053MaximumSubarrayTest {
    private final Problem0053MaximumSubarray tested = new Problem0053MaximumSubarray();

    @Test
    void maxSubArrayTestCase1() {
        assertEquals(6, tested.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void maxSubArrayTestCase2() {
        assertEquals(1, tested.maxSubArray(new int[]{1}));
    }

    @Test
    void maxSubArrayTestCase3() {
        assertEquals(23, tested.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}