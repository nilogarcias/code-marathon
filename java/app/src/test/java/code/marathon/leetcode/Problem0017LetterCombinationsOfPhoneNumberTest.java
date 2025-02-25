package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem0017LetterCombinationsOfPhoneNumberTest {
    private final Problem0017LetterCombinationsOfPhoneNumber tested = new Problem0017LetterCombinationsOfPhoneNumber();

    @Test
    void letterCombinationsTestCase1() {
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals(expected, tested.letterCombinations("23"));
    }

    @Test
    void letterCombinationsTestCase2() {
        assertEquals(List.of(), tested.letterCombinations(""));
    }

    @Test
    void letterCombinationsTestCase3() {
        List<String> expected = List.of("a","b","c");
        assertEquals(expected, tested.letterCombinations("2"));
    }
}