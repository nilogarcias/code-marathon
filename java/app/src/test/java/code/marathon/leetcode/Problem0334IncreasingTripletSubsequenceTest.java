package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem0334IncreasingTripletSubsequenceTest {
    private final Problem0334IncreasingTripletSubsequence tested = new Problem0334IncreasingTripletSubsequence();

    @Test
    void increasingTripletTestCase1() {
        assertTrue(tested.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void increasingTripletTestCase2() {
        assertFalse(tested.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void increasingTripletTestCase3() {
        assertTrue(tested.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    @Test
    void increasingTripletTestCase4() {
        assertTrue(tested.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
    }

    @Test
    void increasingTripletTestCase5() {
        int[] nums = new int[50_000];
        Arrays.fill(nums, 1);
        nums[49_998] = 3;
        nums[49_999] = 7;
        assertTrue(tested.increasingTriplet(nums));
    }
}