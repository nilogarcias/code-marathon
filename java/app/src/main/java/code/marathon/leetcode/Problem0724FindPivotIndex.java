package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/find-pivot-index/description">724. Find Pivot Index</a>
 * Complexity: O(n)
 * Space: O(2n)
 */
public class Problem0724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] leftPrefixSum = new int[nums.length];
        int[] rightPrefixSum = new int[nums.length];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            leftPrefixSum[i] = leftPrefixSum[i - 1] + nums[i - 1];
            rightPrefixSum[n - 1 - i] = rightPrefixSum[n - i] + nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            if (leftPrefixSum[i] == rightPrefixSum[i]) {
                return i;
            }
        }

        return -1;
    }
}
