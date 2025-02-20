package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0392IsSubsequenceTest {
    private final Problem0392IsSubsequence tested = new Problem0392IsSubsequence();

    @Test
    void isSubsequenceTestCase1() {
        assertTrue(tested.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void isSubsequenceTestCase2() {
        assertFalse(tested.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void isSubsequenceTestCase3() {
        assertTrue(tested.isSubsequence("abc", "abc"));
    }

    @Test
    void isSubsequenceTestCase4() {
        assertTrue(tested.isSubsequence("", "ahbgdc"));
    }

    @Test
    void isSubsequenceTestCase5() {
        assertTrue(tested.isSubsequence("b", "abc"));
    }
}