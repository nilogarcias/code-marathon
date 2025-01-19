package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1456MaxNumVowelsInSubstrGivenLengthTest {
    Problem1456MaxNumVowelsInSubstrGivenLength tested = new Problem1456MaxNumVowelsInSubstrGivenLength();

    @Test
    void maxVowelsTestCase1() {
        assertEquals(3, tested.maxVowels("abciiidef", 3));
    }

    @Test
    void maxVowelsTestCase2() {
        assertEquals(2, tested.maxVowels("aeiou", 2));
    }

    @Test
    void maxVowelsTestCase3() {
        assertEquals(2, tested.maxVowels("leetcode", 3));
    }
}