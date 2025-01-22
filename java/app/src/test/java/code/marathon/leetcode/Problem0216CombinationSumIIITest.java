package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem0216CombinationSumIIITest {
    private final Problem0216CombinationSumIII tested = new Problem0216CombinationSumIII();

    @Test
    void combinationSum3TestCase1() {
        List<List<Integer>> expected = List.of(List.of(1, 2, 4));
        List<List<Integer>> combinations = tested.combinationSum3(3, 7);
        assertEquals(expected, combinations);
    }

    @Test
    void combinationSum3TestCase2() {
        List<List<Integer>> expected = List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4));
        List<List<Integer>> combinations = tested.combinationSum3(3, 9);
        assertEquals(expected, combinations);
    }

    @Test
    void combinationSum3TestCase3() {
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> combinations = tested.combinationSum3(4, 1);
        assertEquals(expected, combinations);
    }

    @Test
    void combinationSum3TestCase4() {
        List<List<Integer>> expected = List.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<List<Integer>> combinations = tested.combinationSum3(9, 45);
        assertEquals(expected, combinations);
    }
}