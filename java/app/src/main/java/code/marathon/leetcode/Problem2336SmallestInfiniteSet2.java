package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/smallest-number-in-infinite-set/description">2336 - Smallest Number in a Infinite Set</a>
 * Complexity: O(n)
 * Space: O(n)
 */
public class Problem2336SmallestInfiniteSet2 {
    private int minIdx;
    private final boolean[] positiveNumbers;

    public Problem2336SmallestInfiniteSet2() {
        this.minIdx = 0;
        this.positiveNumbers = new boolean[1001];
    }

    public int popSmallest() {
        while (positiveNumbers[minIdx++]);
        positiveNumbers[minIdx - 1] = true;

        return minIdx;
    }

    public void addBack(int num) {
        positiveNumbers[num - 1] = false;
        minIdx = Math.min(minIdx, num - 1);
    }
}
