package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1318MinimumFlipsMakeAOrBEqualCTest {
    private final Problem1318MinimumFlipsMakeAOrBEqualC tested = new Problem1318MinimumFlipsMakeAOrBEqualC();

    @Test
    void minFlipsTestCase1() {
        assertEquals(3, tested.minFlips(2, 6, 5));
    }

    @Test
    void minFlipsTestCase2() {
        assertEquals(1, tested.minFlips(4, 2, 7));
    }

    @Test
    void minFlipsTestCase3() {
        assertEquals(0, tested.minFlips(1, 2, 3));
    }

    @Test
    void minFlipsTestCase4() {
        assertEquals(3, tested.minFlips(8, 3, 5));
    }

    @Test
    void minFlipsTestCase5() {
        assertEquals(4, tested.minFlips(5, 2, 8));
    }
}