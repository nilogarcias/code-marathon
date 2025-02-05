package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0994RottingOrangesTest {
    private final Problem0994RottingOranges tested = new Problem0994RottingOranges();

    @Test
    void orangesRottingTestCase1() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, tested.orangesRotting(grid));
    }

    @Test
    void orangesRottingTestCase2() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(-1, tested.orangesRotting(grid));
    }

    @Test
    void orangesRottingTestCase3() {
        int[][] grid = {{0, 2}};
        assertEquals(0, tested.orangesRotting(grid));
    }
}