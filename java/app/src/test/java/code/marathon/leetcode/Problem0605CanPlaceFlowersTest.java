package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0605CanPlaceFlowersTest {
    private final Problem0605CanPlaceFlowers tested = new Problem0605CanPlaceFlowers();

    @Test
    void canPlaceFlowersTestCase1() {
        assertTrue(tested.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    void canPlaceFlowersTestCase2() {
        assertFalse(tested.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    @Test
    void canPlaceFlowersTestCase3() {
        assertFalse(tested.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }

    @Test
    void canPlaceFlowersTestCase5() {
        assertTrue(tested.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 1, 0, 0}, 0));
    }
}