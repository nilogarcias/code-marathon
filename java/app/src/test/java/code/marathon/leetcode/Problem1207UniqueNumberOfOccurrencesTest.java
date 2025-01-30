package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1207UniqueNumberOfOccurrencesTest {
    private final Problem1207UniqueNumberOfOccurrences tested = new Problem1207UniqueNumberOfOccurrences();

    @Test
    void uniqueOccurrencesTestCase1() {
        assertTrue(tested.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    void uniqueOccurrencesTestCase2() {
        assertFalse(tested.uniqueOccurrences(new int[]{1, 2}));
    }

    @Test
    void uniqueOccurrencesTestCase3() {
        assertTrue(tested.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}