package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2390RemovingStarsFromStringTest {
    private final Problem2390RemovingStarsFromString tested = new Problem2390RemovingStarsFromString();

    @Test
    void removeStarsTestCase1() {
        assertEquals("lecoe", tested.removeStars("leet**cod*e"));
    }

    @Test
    void removeStarsTestCase2() {
        assertEquals("", tested.removeStars("erase*****"));
    }
}