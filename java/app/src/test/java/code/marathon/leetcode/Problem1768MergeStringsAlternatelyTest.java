package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1768MergeStringsAlternatelyTest {
    private final Problem1768MergeStringsAlternately tested = new Problem1768MergeStringsAlternately();

    @Test
    void mergeAlternatelyTestCase1() {
        assertEquals("apbqcr", tested.mergeAlternately("abc", "pqr"));
    }

    @Test
    void mergeAlternatelyTestCase2() {
        assertEquals("apbqrs", tested.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void mergeAlternatelyTestCase3() {
        assertEquals("apbqcd", tested.mergeAlternately("abcd", "pq"));
    }
}