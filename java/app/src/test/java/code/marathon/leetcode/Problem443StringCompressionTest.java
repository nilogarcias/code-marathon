package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem443StringCompressionTest {
    Problem443StringCompression tested = new Problem443StringCompression();

    private void assertTestCase(char[] input, String expected) {
        assertEquals(expected.length(), tested.compress(input));
        for (int i = 0; i < expected.length(); i++) {
            assertEquals(expected.charAt(i), input[i]);
        }
    }

    @Test
    void compressCase1() {
        char[] input = {'a','a','b','b','c','c','c'};
        String expected = "a2b2c3";
        assertTestCase(input, expected);
    }

    @Test
    void compressCase2() {
        char[] input = {'a'};
        String expected = "a";
        assertTestCase(input, expected);
    }

    @Test
    void compressCase3() {
        char[] input = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        String expected = "ab12";
        assertTestCase(input, expected);
    }


    @Test
    void compressCase4() {
        char[] input = {'a','a','a','b','b','c','c','c'};
        String expected = "a3b2c3";
        assertTestCase(input, expected);
    }
}