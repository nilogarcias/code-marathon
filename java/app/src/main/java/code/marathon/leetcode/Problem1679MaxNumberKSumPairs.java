package code.marathon.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1679MaxNumberKSumPairs {
    // O(n)
    private int maxOpsHashMap(int[] nums, int k) {
        Map<Integer, Integer> countNum = new HashMap<>();
        int numOps = 0;

        for (int num : nums) {
            // We can ignore numbers > k
            if (num < k) {
                // Count the ocurrence of the number
                countNum.put(num, countNum.getOrDefault(num, 0) + 1);
                int sumPair = k - num;
                // Check if there is a sum pair
                if (countNum.containsKey(sumPair) &&
                        ((num == sumPair && countNum.get(sumPair) > 1) ||
                                (num != sumPair && countNum.get(sumPair) > 0))) {
                    // Decrement the number counters
                    countNum.put(num, countNum.get(num) - 1);
                    countNum.put(sumPair, countNum.get(sumPair) - 1);
                    // Increment the number of k-sum pairs
                    numOps++;
                }
            }
        }

        return numOps;
    }

    // O(n log n)
    private int maxOpsTwoPointers(int[] nums, int k) {
        Arrays.sort(nums);
        int sum;
        int numOps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            sum = nums[left] + nums[right];

            // We have a match.
            if (sum == k) {
                numOps++;
                left++;
                right--;
            } else if (sum < k) {
                // We need to shift left pointer.
                left++;
            } else if (sum > k) {
                // We need to shift right pointer.
                right--;
            }
        }

        return numOps;
    }

    public int maxOperations(int[] nums, int k) {
        return maxOpsTwoPointers(nums, k);
    }
}
