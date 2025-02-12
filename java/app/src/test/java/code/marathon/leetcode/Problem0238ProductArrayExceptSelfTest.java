package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0238ProductArrayExceptSelfTest {
    private final Problem0238ProductArrayExceptSelf tested = new Problem0238ProductArrayExceptSelf();

    @Test
    void productExceptSelfTestCase1() {
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, tested.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void productExceptSelfTestCase2() {
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, tested.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}