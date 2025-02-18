package code.marathon.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/maximum-subsequence-score">2542. Maximum Subsequence Score</a>
 */
public class Problem2542MaxSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] pairs = new int[nums1.length][2];
        for (int i = 0; i < nums1.length; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        // Sorting the pairs by descending order of the nums2
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
        PriorityQueue<Integer> topKHeap = new PriorityQueue<>(k);
        long topKSum = 0;
        for (int i = 0; i < k; i++) {
            topKSum += pairs[i][0];
            topKHeap.add(pairs[i][0]);
        }

        // The score of the first k pairs.
        long answer = topKSum * pairs[k - 1][1];
        for (int i = k; i < nums1.length; i++) {
            // Remove the smallest integer from the previous top k elements
            // then add nums1[i] to the top k elements.
            topKSum += (pairs[i][0] - topKHeap.remove());
            topKHeap.add(pairs[i][0]);

            // Update answer as the maximum score.
            answer = Math.max(answer, topKSum * pairs[i][1]);
        }

        return answer;
    }
}
