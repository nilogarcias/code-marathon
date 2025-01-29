package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/description">283. Move Zeroes</a>
 * Complexity: O(n)
 * Space: O(1)
 */
public class Problem0283MoveZeroes {
    private void moveZeroesUsing2Pointers(int[] nums) {
        int zeroIdx = 0;
        int nonZeroIdx = 0;
        int n = nums.length;

        while (zeroIdx < n && nonZeroIdx < n) {
            while (zeroIdx < n && nums[zeroIdx] != 0) {
                zeroIdx++;
            }
            while (nonZeroIdx < n && nums[nonZeroIdx] == 0) {
                nonZeroIdx++;
            }

            if (zeroIdx < nonZeroIdx && nonZeroIdx < n) {
                nums[zeroIdx] = nums[nonZeroIdx];
                nums[nonZeroIdx] = 0;
            } else {
                zeroIdx = Math.max(zeroIdx, nonZeroIdx);
                nonZeroIdx = zeroIdx;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[j++] = temp;
            }
        }
    }
}
