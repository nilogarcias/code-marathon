package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a>
 */
public class Problem0011ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        int h;

        while (left < right) {
            h = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, h * (right - left));


            while (left < right && height[left] <= h) {
                left++;
            }

            while (left < right && height[right] <= h) {
                right--;
            }
        }

        return maxWater;
    }
}
