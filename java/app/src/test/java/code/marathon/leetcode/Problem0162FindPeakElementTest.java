package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0162FindPeakElementTest {
    private final Problem0162FindPeakElement tested = new Problem0162FindPeakElement();

    @Test
    void findPeakElementTestCase1() {
        assertEquals(2, tested.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    void findPeakElementTestCase2() {
        assertEquals(1, tested.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}