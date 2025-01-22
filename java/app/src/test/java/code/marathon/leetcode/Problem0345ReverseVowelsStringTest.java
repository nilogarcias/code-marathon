package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0345ReverseVowelsStringTest {
    private final Problem0345ReverseVowelsString tested = new Problem0345ReverseVowelsString();

    @Test
    void reverseVowelsTestCase1() {
        assertEquals("AceCreIm", tested.reverseVowels("IceCreAm"));
    }

    @Test
    void reverseVowelsTestCase2() {
        assertEquals("leotcede", tested.reverseVowels("leetcode"));
    }
}