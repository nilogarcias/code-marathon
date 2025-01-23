package code.marathon.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Problem0342MinimumNumberOfArrowsBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));

        int arrowsCount = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrowsCount++;
                end = points[i][1];
            }
        }

        return arrowsCount;
    }
}
