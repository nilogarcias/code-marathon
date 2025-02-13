package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1466ReorderRoutesMakeAllPathsLeadCityZeroTest {
    private final Problem1466ReorderRoutesMakeAllPathsLeadCityZero tested = new Problem1466ReorderRoutesMakeAllPathsLeadCityZero();

    @Test
    void minReorderTestCase1() {
        assertEquals(3, tested.minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}));
    }

    @Test
    void minReorderTestCase2() {
        assertEquals(2, tested.minReorder(5, new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}}));
    }

    @Test
    void minReorderTestCase3() {
        assertEquals(0, tested.minReorder(3, new int[][]{{1, 0}, {2, 0}}));
    }
}