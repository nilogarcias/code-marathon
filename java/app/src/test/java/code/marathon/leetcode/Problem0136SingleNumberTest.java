package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0136SingleNumberTest {
    private final Problem0136SingleNumber tested = new Problem0136SingleNumber();

    @Test
    void singleNumberTestCase1() {
        assertEquals(1, tested.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void singleNumberTestCase2() {
        assertEquals(4, tested.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void singleNumberTestCase3() {
        assertEquals(1, tested.singleNumber(new int[]{1}));
    }
}