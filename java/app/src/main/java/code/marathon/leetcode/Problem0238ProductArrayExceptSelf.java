package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/">238. Product of Array Except Self</a>
 */
public class Problem0238ProductArrayExceptSelf {
    private int[] productExceptSelfWithAuxSpace(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        int[] suffix = new int[n + 1];
        prefix[0] = 1;
        suffix[nums.length] = 1;

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] * nums[i];
            suffix[n - i - 1] = suffix[n - i] * nums[n - i - 1];
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = prefix[i] * suffix[i + 1];
        }

        return answer;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return answer;
    }
}
