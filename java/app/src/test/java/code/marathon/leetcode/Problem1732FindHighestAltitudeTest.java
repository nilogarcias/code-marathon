package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1732FindHighestAltitudeTest {
    private final Problem1732FindHighestAltitude tested = new Problem1732FindHighestAltitude();

    @Test
    void largestAltitudeTestCase1() {
        assertEquals(1, tested.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    void largestAltitudeTestCase2() {
        assertEquals(0, tested.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}