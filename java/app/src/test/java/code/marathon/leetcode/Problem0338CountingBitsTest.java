package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0338CountingBitsTest {
    private final Problem0338CountingBits tested = new Problem0338CountingBits();

    @Test
    void countBitsTestCase1() {
        assertArrayEquals(new int[]{0, 1, 1}, tested.countBits(2));
    }

    @Test
    void countBitsTestCase2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, tested.countBits(5));
    }

    @Test
    void countBitsTestCase3() {
        assertArrayEquals(new int[]{0}, tested.countBits(0));
    }

}