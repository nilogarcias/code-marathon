package code.marathon.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">215. Kth Largest Element in an Array</a>
 */
public class Problem0215KthLargestElementArray {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> largestNumbers = new PriorityQueue<>(k + 1);
        for (int num : nums) {
            largestNumbers.add(num);
            if (largestNumbers.size() > k) {
                largestNumbers.poll();
            }
        }

        return (largestNumbers.isEmpty()) ? -1 : largestNumbers.poll();
    }
}
