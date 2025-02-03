package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0374GuessNumberHigherOrLowerTest {

    private void assertPickedNumber(int picked, int n) {
        Problem0374GuessNumberHigherOrLower tested = new Problem0374GuessNumberHigherOrLower() {
            @Override
            public int guess(int num) {
                return Integer.compare(picked, num);
            }
        };

        assertEquals(picked, tested.guessNumber(n));
    }
    @Test
    void guessNumberTestCase1() {
        assertPickedNumber(6, 10);
    }

    @Test
    void guessNumberTestCase2() {
        assertPickedNumber(1, 2);
    }

    @Test
    void guessNumberTestCase3() {
        assertPickedNumber(1, 1);
    }
}