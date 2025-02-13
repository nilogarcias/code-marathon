package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1431KidsWithGreatestNumberCandiesTest {
    private final Problem1431KidsWithGreatestNumberCandies tested = new Problem1431KidsWithGreatestNumberCandies();

    @Test
    void kidsWithCandiesTestCase1() {
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertEquals(expected, tested.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    @Test
    void kidsWithCandiesTestCase2() {
        List<Boolean> expected = List.of(true, false, false, false, false);
        assertEquals(expected, tested.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }

    @Test
    void kidsWithCandiesTestCase3() {
        List<Boolean> expected = List.of(true, false, true);
        assertEquals(expected, tested.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}