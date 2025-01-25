package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2336SmallestInfiniteSetTest {
    @Test
    void testCase1() {
        Problem2336SmallestInfiniteSet tested = new Problem2336SmallestInfiniteSet();
        tested.addBack(2);
        assertEquals(1, tested.popSmallest());
        assertEquals(2, tested.popSmallest());
        assertEquals(3, tested.popSmallest());
        tested.addBack(1);
        assertEquals(1, tested.popSmallest());
        assertEquals(4, tested.popSmallest());
        assertEquals(5, tested.popSmallest());
    }

    @Test
    void testCase2() {
        Problem2336SmallestInfiniteSet2 tested = new Problem2336SmallestInfiniteSet2();
        tested.addBack(2);
        assertEquals(1, tested.popSmallest());
        assertEquals(2, tested.popSmallest());
        assertEquals(3, tested.popSmallest());
        tested.addBack(1);
        assertEquals(1, tested.popSmallest());
        assertEquals(4, tested.popSmallest());
        assertEquals(5, tested.popSmallest());
    }
}