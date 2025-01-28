package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0435NonOverlappingIntervalsTest {
    private final Problem0435NonOverlappingIntervals tested = new Problem0435NonOverlappingIntervals();

    @Test
    void eraseOverlapIntervalsTestCase1() {
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, tested.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervalsTestCase2() {
        int[][] intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, tested.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervalsTestCase3() {
        int[][] intervals = new int[][]{{1, 2}, {2, 3}};
        assertEquals(0, tested.eraseOverlapIntervals(intervals));
    }
}