package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */
public class Problem0053MaximumSubarray {
    // Kadane algorithm
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxGlobal = Math.max(maxGlobal, currentSum);
        }

        return maxGlobal;
    }
}
