package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/find-the-highest-altitude/">1732. Find the Highest Altitude</a>
 * Complexity: O(n)
 * Space: O(1)
 */
public class Problem1732FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int gainAltitude : gain) {
            altitude += gainAltitude;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }
}
