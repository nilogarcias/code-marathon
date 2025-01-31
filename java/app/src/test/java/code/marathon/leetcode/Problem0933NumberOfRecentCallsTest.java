package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0933NumberOfRecentCallsTest {
    private final Problem0933NumberOfRecentCalls.RecentCounter tested =
            new Problem0933NumberOfRecentCalls.RecentCounter();

    @Test
    void testCase1() {
        assertEquals(1, tested.ping(1));
        assertEquals(2, tested.ping(100));
        assertEquals(3, tested.ping(3001));
        assertEquals(3, tested.ping(3002));
    }
}