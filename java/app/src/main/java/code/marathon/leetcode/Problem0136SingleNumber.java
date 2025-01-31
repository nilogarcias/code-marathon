package code.marathon.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/single-number">136. Single Number</a>
 */
public class Problem0136SingleNumber {
    // Complexity: O(n log n)
    // Space: O(1)
    private int singleNumberUsingSort(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        int n = nums.length - 1;
        for (int i = 0; i < n; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[n];
    }

    // Complexity: O(n)
    // Space: O(1)
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int singleNumber = nums[0];
        if (n == 1) {
            return singleNumber;
        }

        for (int i = 1; i < n; i++) {
            singleNumber ^= nums[i];
        }

        return singleNumber;
    }
}
