package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem0399EvaluateDivisionTest {
    private final Problem0399EvaluateDivision tested = new Problem0399EvaluateDivision();

    @Test
    void calcEquationTestCase1() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"));
        double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};
        assertArrayEquals(expected, tested.calcEquation(equations, values, queries));
    }

    @Test
    void calcEquationTestCase2() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"));
        double[] expected = {3.75, 0.4, 5.0, 0.2};
        assertArrayEquals(expected, tested.calcEquation(equations, values, queries));
    }

    @Test
    void calcEquationTestCase3() {
        List<List<String>> equations = List.of(List.of("a", "b"));
        double[] values = {0.5};
        List<List<String>> queries = List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"));
        double[] expected = {0.5, 2.0, -1.0, -1.0};
        assertArrayEquals(expected, tested.calcEquation(equations, values, queries));
    }
}