package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2542MaxSubsequenceScoreTest {
    private final Problem2542MaxSubsequenceScore tested = new Problem2542MaxSubsequenceScore();

    @Test
    void maxScoreTestCase1() {
        assertEquals(12, tested.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3));
    }

    @Test
    void maxScoreTestCase2() {
        assertEquals(30, tested.maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1));
    }

    @Test
    void maxScoreTestCase3() {
        assertEquals(45, tested.maxScore(new int[]{4, 2, 3, 5, 1}, new int[]{7, 5, 10, 9, 6}, 1));
    }

    @Test
    void maxScoreTestCase4() {
        assertEquals(168, tested.maxScore(new int[]{2,1,14,12}, new int[]{11,7,13,6}, 3));
    }
}
