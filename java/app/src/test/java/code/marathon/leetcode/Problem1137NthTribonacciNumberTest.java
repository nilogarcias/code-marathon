package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1137NthTribonacciNumberTest {
    private final Problem1137NthTribonacciNumber tested = new Problem1137NthTribonacciNumber();

    @Test
    void tribonacciTestCase1() {
        assertEquals(4, tested.tribonacci(4));
    }

    @Test
    void tribonacciTestCase2() {
        assertEquals(1_389_537, tested.tribonacci(25));
    }

    @Test
    void tribonacciTestCase3() {
        assertEquals(2_082_876_103, tested.tribonacci(37));
    }
}