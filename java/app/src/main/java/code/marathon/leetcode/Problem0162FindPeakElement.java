package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/find-peak-element/">162. Find Peak Element</a>
 * It's strange that the problem ask to implement a O(log n) solution so, we should use a
 * binary search algorithm. But the <code>nums</code> array should be ordered.
 */
public class Problem0162FindPeakElement {
    public int findPeakElement(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int next;
        for (int i = 0; i < nums.length; i++) {
            next = (i + 1 >= nums.length) ? Integer.MIN_VALUE : nums[i + 1];
            if (prev < nums[i] && next < nums[i]) {
                return i;
            }
            prev = nums[i];
        }

        return 0;
    }
}
