package code.marathon.leetcode;

import java.util.*;

public class Problem2352EqualRowColumnPairs {
    public int equalPairs(int[][] grid) {
        Map<Integer, List<int[]>> rowsHashCountMap = new HashMap<>();
        Map<Integer, List<int[]>> colsHashCountMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            int rowHash = Arrays.hashCode(grid[i]);
            rowsHashCountMap.computeIfAbsent(rowHash, key -> new ArrayList<>()).add(grid[i]);
            int[] column = new int[grid[0].length];
            for (int j = 0; j < column.length; j++) {
                column[j] = grid[j][i];
            }
            int colHash = Arrays.hashCode(column);
            colsHashCountMap.computeIfAbsent(colHash, key -> new ArrayList<>()).add(column);
        }

        int rowColPairCount = 0;
        for (Map.Entry<Integer, List<int[]>> rowHashCount : rowsHashCountMap.entrySet()) {
            if (colsHashCountMap.containsKey(rowHashCount.getKey())) {
                for (int[] row : rowHashCount.getValue()) {
                    for (int[] col : colsHashCountMap.get(rowHashCount.getKey())) {
                        if (Arrays.equals(row, col)) {
                            rowColPairCount++;
                        }
                    }
                }
            }
        }

        return rowColPairCount;
    }
}
