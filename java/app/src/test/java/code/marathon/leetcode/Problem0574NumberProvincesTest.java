package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0574NumberProvincesTest {
    private final Problem0574NumberProvinces tested = new Problem0574NumberProvinces();

    @Test
    void findCircleNumTestCase1() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        assertEquals(2, tested.findCircleNum(isConnected));
    }

    @Test
    void findCircleNumTestCase2() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, tested.findCircleNum(isConnected));
    }

    @Test
    void findCircleNumTestCase3() {
        int[][] isConnected = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        assertEquals(1, tested.findCircleNum(isConnected));
    }
}