package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0735AsteroidCollisionTest {
    private final Problem0735AsteroidCollision tested = new Problem0735AsteroidCollision();

    @Test
    void asteroidCollisionTestCase1() {
        int[] asteroids = {5, 10, -5};
        int[] expected = {5, 10};
        assertArrayEquals(expected, tested.asteroidCollision(asteroids));
    }

    @Test
    void asteroidCollisionTestCase2() {
        int[] asteroids = {8, -8};
        int[] expected = {};
        assertArrayEquals(expected, tested.asteroidCollision(asteroids));
    }

    @Test
    void asteroidCollisionTestCase3() {
        int[] asteroids = {10, 2, -5};
        int[] expected = {10};
        assertArrayEquals(expected, tested.asteroidCollision(asteroids));
    }

    @Test
    void asteroidCollisionTestCase4() {
        int[] asteroids = {-2, -2, 1, -2};
        int[] expected = {-2, -2, -2};
        assertArrayEquals(expected, tested.asteroidCollision(asteroids));
    }
}