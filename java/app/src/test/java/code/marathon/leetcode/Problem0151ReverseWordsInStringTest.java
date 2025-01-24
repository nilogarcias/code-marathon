package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0151ReverseWordsInStringTest {
    private final Problem0151ReverseWordsInString tested = new Problem0151ReverseWordsInString();

    @Test
    void reverseWordsTestCase1() {
        assertEquals("blue is sky the", tested.reverseWords("the sky is blue"));
    }

    @Test
    void reverseWordsTestCase2() {
        assertEquals("world hello", tested.reverseWords("  hello world  "));
    }

    @Test
    void reverseWordsTestCase3() {
        assertEquals("example good a", tested.reverseWords("a good   example"));
    }
}