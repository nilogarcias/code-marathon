package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a>
 * Using DFS approach but, in case the number of recursions is so high (overflow in stacktrace), we can use the BFS.
 */
public class Problem0200NumberOfIslands {
    private void dfs(int row, int col, int m, int n, char[][] grid) {
        grid[row][col] = '*';
        if (row > 0 && grid[row - 1][col] == '1') {
            dfs(row - 1, col, m, n, grid);
        }
        if (row + 1 < m && grid[row + 1][col] == '1') {
            dfs(row + 1, col, m, n, grid);
        }
        if (col > 0 && grid[row][col - 1] == '1') {
            dfs(row, col - 1, m, n, grid);
        }
        if (col + 1 < n && grid[row][col + 1] == '1') {
            dfs(row, col + 1, m, n, grid);
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islandsCounter = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == '1') {
                    islandsCounter++;
                    dfs(row, col, m, n, grid);
                }
            }
        }

        return islandsCounter;
    }
}
