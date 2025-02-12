package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem2215FindDifferenceTwoArraysTest {
    private final Problem2215FindDifferenceTwoArrays tested = new Problem2215FindDifferenceTwoArrays();

    @Test
    void findDifferenceTestCase1() {
        List<List<Integer>> expected = List.of(List.of(1, 3), List.of(4, 6));
        assertEquals(expected, tested.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }

    @Test
    void findDifferenceTestCase2() {
        List<List<Integer>> expected = List.of(List.of(3), List.of());
        assertEquals(expected, tested.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }
}