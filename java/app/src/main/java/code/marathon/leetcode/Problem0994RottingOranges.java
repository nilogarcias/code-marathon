package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/rotting-oranges/description">994. Rotting Oranges</a>
 */
public class Problem0994RottingOranges {
    private static final int[] ROW_OFFSET = {-1, 0, 1, 0};
    private static final int[] COL_OFFSET = {0, 1, 0, -1};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> rottingOranges = new ArrayDeque<>();
        int freshOrangesCount = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    freshOrangesCount++;
                } else if (grid[row][col] == 2) {
                    rottingOranges.offer(new int[]{row, col});
                }
            }
        }

        // BFS part
        int minutes = 0;
        while (!rottingOranges.isEmpty() && freshOrangesCount > 0) {

            // Processing all rotting oranges inserted in the previous iteration
            for (int oranges = rottingOranges.size(); oranges > 0; oranges--) {
                int[] rottingOrange = rottingOranges.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int newRow = rottingOrange[0] + ROW_OFFSET[dir];
                    int newCol = rottingOrange[1] + COL_OFFSET[dir];

                    // check if is a valid cel and if it's a fresh orange
                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == 1) {
                        // Rotting the orange
                        grid[newRow][newCol] = 2;
                        // Decrement the number of fresh oranges
                        freshOrangesCount--;
                        // Add the new rotting orange to the next iteration
                        rottingOranges.offer(new int[]{newRow, newCol});
                    }
                }
            }

            minutes++;
        }

        return (freshOrangesCount > 0) ? -1 : minutes;
    }
}
