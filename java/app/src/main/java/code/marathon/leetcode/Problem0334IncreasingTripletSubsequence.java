package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/increasing-triplet-subsequence/description">334. Increasing Triplet Subsequence</a>
 */
public class Problem0334IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;

        for (int value : nums) {
            if (value <= a) {
                a = value;
            } else if (value <= b) {
                b = value;
            } else {
                return true;
            }
        }

        return false;
    }
}
