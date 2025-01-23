package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2352EqualRowColumnPairsTest {
    private final Problem2352EqualRowColumnPairs tested = new Problem2352EqualRowColumnPairs();

    @Test
    void equalPairsTestCase1() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        assertEquals(1, tested.equalPairs(grid));
    }

    @Test
    void equalPairsTestCase2() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        assertEquals(3, tested.equalPairs(grid));
    }

    @Test
    void equalPairsTestCase3() {
        int[][] grid = {{2, 1}, {3, 32}};
        assertEquals(0, tested.equalPairs(grid));
    }
}