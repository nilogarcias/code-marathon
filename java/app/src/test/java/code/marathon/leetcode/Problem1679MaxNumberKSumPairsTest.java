package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1679MaxNumberKSumPairsTest {
    private final Problem1679MaxNumberKSumPairs tested = new Problem1679MaxNumberKSumPairs();

    @Test
    void maxOperationsTestCase1() {
        assertEquals(2, tested.maxOperations(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void maxOperationsTestCase2() {
        assertEquals(1, tested.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }
}