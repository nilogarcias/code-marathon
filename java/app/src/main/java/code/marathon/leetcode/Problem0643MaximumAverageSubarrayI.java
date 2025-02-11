package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/">643. Maximum Average Subarray I</a>
 * Complexity: O(n)
 * Space: O(n)
 */
public class Problem0643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        double maxAvg = prefix[k - 1] / (double)k;

        for (int i = k; i < n; i++) {
            maxAvg = Math.max(maxAvg, (prefix[i] - prefix[i - k]) / (double)k);
        }

        return maxAvg;
    }
}
