package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/">2215. Find the Difference of Two Arrays</a>
 * Complexity: O(n)
 * Space: O(n)
 */
public class Problem2215FindDifferenceTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> distNums1 = new ArrayList<>(nums1Set.size());
        List<Integer> distNums2 = new ArrayList<>(nums2Set.size());
        List<List<Integer>> answer = new ArrayList<>(2);
        answer.add(distNums1);
        answer.add(distNums2);

        for (var num : nums1Set) {
            if (!nums2Set.contains(num)) {
                distNums1.add(num);
            }
        }

        for (var num : nums2Set) {
            if (!nums1Set.contains(num)) {
                distNums2.add(num);
            }
        }

        return answer;
    }
}
