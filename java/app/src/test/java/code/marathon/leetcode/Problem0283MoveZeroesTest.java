package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0283MoveZeroesTest {
    private final Problem0283MoveZeroes tested = new Problem0283MoveZeroes();

    @Test
    void moveZeroesTestCase1() {
        int[] nums = {0, 1, 0, 3, 12};
        tested.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void moveZeroesTestCase2() {
        int[] nums = {0};
        tested.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void moveZeroesTestCase3() {
        int[] nums = {1, 0};
        tested.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0}, nums);
    }

    @Test
    void moveZeroesTestCase4() {
        int[] nums = {1, 0, 1};
        tested.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 1, 0}, nums);
    }
}