package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0011ContainerWithMostWaterTest {
    private final Problem0011ContainerWithMostWater tested = new Problem0011ContainerWithMostWater();

    @Test
    void maxAreaTestCase1() {
        assertEquals(49, tested.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void maxAreaTestCase2() {
        assertEquals(1, tested.maxArea(new int[]{1, 1}));
    }
}