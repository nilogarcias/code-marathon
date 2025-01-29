package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0724FindPivotIndexTest {
    private final Problem0724FindPivotIndex tested = new Problem0724FindPivotIndex();

    @Test
    void pivotIndexTestCase1() {
        assertEquals(3, tested.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    void pivotIndexTestCase2() {
        assertEquals(-1, tested.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    void pivotIndexTestCase3() {
        assertEquals(0, tested.pivotIndex(new int[]{2, 1, -1}));
    }
}