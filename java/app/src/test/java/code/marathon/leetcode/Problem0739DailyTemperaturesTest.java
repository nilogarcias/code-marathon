package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0739DailyTemperaturesTest {
    private final Problem0739DailyTemperatures tested = new Problem0739DailyTemperatures();

    @Test
    void dailyTemperaturesTestCase1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, tested.dailyTemperatures(temperatures));
    }

    @Test
    void dailyTemperaturesTestCase2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] expected = {1, 1, 1, 0};
        assertArrayEquals(expected, tested.dailyTemperatures(temperatures));
    }

    @Test
    void dailyTemperaturesTestCase3() {
        int[] temperatures = {30, 60, 90};
        int[] expected = {1, 1, 0};
        assertArrayEquals(expected, tested.dailyTemperatures(temperatures));
    }
}