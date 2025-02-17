package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0746MinCostClimbingStairsTest {
    private final Problem0746MinCostClimbingStairs tested = new Problem0746MinCostClimbingStairs();

    @Test
    void minCostClimbingStairsTestCase1() {
        assertEquals(15, tested.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    void minCostClimbingStairsTestCase2() {
        assertEquals(6, tested.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}