package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/">1926 - Nearest Exit From Entrance in Maze</a>
 */
public class Problem1926NearestExitFromEntranceInMaze {
    static class Cell {
        int row;
        int column;
        int movements;

        Cell(int row, int column) {
            this(row, column, 0);
        }

        Cell(int row, int column, int movements) {
            this.row = row;
            this.column = column;
            this.movements = movements;
        }

        public Cell up() {
            return new Cell(row - 1, column, movements + 1);
        }

        public Cell down() {
            return new Cell(row + 1, column, movements + 1);
        }

        public Cell left() {
            return new Cell(row, column - 1, movements + 1);
        }

        public Cell right() {
            return new Cell(row, column + 1, movements + 1);
        }

        public Cell nextCell(int direction) {
            return switch (direction) {
                case 0 -> up();
                case 1 -> down();
                case 2 -> left();
                case 3 -> right();
                default -> null;
            };
        }

        public void markVisitedPath(char[][] maze) {
            maze[row][column] = 'V';
        }

        public boolean isValidSpace(char[][] maze) {
            return row >= 0 && column >= 0 && row < maze.length && column < maze[0].length && maze[row][column] == '.';
        }

        public boolean isExit(char[][] maze) {
            return (row == 0 || column == 0 || row == (maze.length - 1) || column == (maze[0].length - 1)) &&
                    movements > 0;
        }
    }

    // Complexity O(m x n)
    // Space O(1)
    private int nearestExitWithClassCell(char[][] maze, int[] entrance) {
        Cell entranceCell = new Cell(entrance[0], entrance[1]);
        Queue<Cell> nextCells = new ArrayDeque<>();
        nextCells.add(entranceCell);
        entranceCell.markVisitedPath(maze);

        while (!nextCells.isEmpty()) {
            Cell cell = nextCells.poll();

            for (int direction = 0; direction < 4; direction++) {
                Cell nextCell = cell.nextCell(direction);
                if (nextCell.isExit(maze)) {
                    return nextCell.movements;
                }

                if (nextCell.isValidSpace(maze)) {
                    nextCells.add(nextCell);
                    cell.markVisitedPath(maze);
                }
            }
        }

        return -1;
    }

    // Complexity O(m x n)
    // Space O(1)
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Deque<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] curr = queue.pollFirst();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];

            for (int i = 0; i < 4; i++) {
                int x = r + dx[i];
                int y = c + dy[i];

                if (x == -1 || y == -1 || x == m || y == n || maze[x][y] == '+') {
                    continue;
                }

                if (x == 0 || y == 0 || x == m - 1 || y == n - 1) {
                    return dist + 1;
                }

                maze[x][y] = '+';
                queue.add(new int[]{x, y, dist + 1});
            }
        }

        return -1;
    }
}
