package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/asteroid-collision/description">735. Asteroid Collision</a>
 */
public class Problem0735AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> remainAsteroids = new ArrayDeque<>();
        int i = 0;

        // Adding all left asteroids
        while (i < asteroids.length && asteroids[i] < 0) {
            remainAsteroids.addLast(asteroids[i++]);
        }

        while (i < asteroids.length) {
            int asteroid = asteroids[i++];
            if (asteroid > 0) {
                // Right asteroid
                remainAsteroids.addLast(asteroid);
            } else {
                // Left asteroid, removing all right asteroids less than current one
                while (!remainAsteroids.isEmpty() && remainAsteroids.peekLast() > 0 && remainAsteroids.peekLast() < Math.abs(asteroid)) {
                    remainAsteroids.pollLast();
                }

                // If all asteroids were removed or remain only left asteroids, adding it
                if (remainAsteroids.isEmpty() || remainAsteroids.peekLast() < 0) {
                    remainAsteroids.addLast(asteroid);
                } else if (remainAsteroids.peekLast() > 0 && remainAsteroids.peekLast() == Math.abs(asteroid)) {
                    // If the last asteroid have the same size, remove both asteroids
                    remainAsteroids.pollLast();
                }
            }
        }

        i = 0;
        int[] result = new int[remainAsteroids.size()];
        while (!remainAsteroids.isEmpty()) {
            result[i++] = remainAsteroids.pollFirst();
        }

        return result;
    }
}
