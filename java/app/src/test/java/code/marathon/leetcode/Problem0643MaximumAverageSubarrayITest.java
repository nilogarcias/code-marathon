package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0643MaximumAverageSubarrayITest {
    private final Problem0643MaximumAverageSubarrayI tested = new Problem0643MaximumAverageSubarrayI();

    @Test
    void findMaxAverageTestCase1() {
        assertEquals(12.75, tested.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    @Test
    void findMaxAverageTestCase2() {
        assertEquals(5.0, tested.findMaxAverage(new int[]{5}, 1));
    }
}