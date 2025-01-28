package code.marathon.leetcode;

import java.util.Comparator;

import static java.util.Arrays.sort;

/**
 * <a href="https://leetcode.com/problems/non-overlapping-intervals/description/">435. Non-overlapping Intervals</a>
 */
public class Problem0435NonOverlappingIntervals {
    // Complexity: O(n log n)
    // Space: O(1)
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort by beginning the intervals
        sort(intervals, Comparator.comparingInt(interval -> interval[1]));

        // Get the end of the first interval
        int previousEndInterval = intervals[0][1];
        int intervalsNonOverlapping = 1;

        // Iterate through the ordered intervals, counting the intervals to remove
        for (int i = 1; i < intervals.length; i++) {
            // if the beginning is less than the end of the first interval
            if (previousEndInterval <= intervals[i][0]) {
                intervalsNonOverlapping++;
                previousEndInterval = intervals[i][1];
            }
        }

        return intervals.length - intervalsNonOverlapping;
    }
}
