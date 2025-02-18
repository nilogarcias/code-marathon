package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0200NumberOfIslandsTest {
    private final Problem0200NumberOfIslands tested = new Problem0200NumberOfIslands();

    @Test
    void numIslandsTestCase1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, tested.numIslands(grid));
    }

    @Test
    void numIslandsTestCase2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, tested.numIslands(grid));
    }
}