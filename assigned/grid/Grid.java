import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Solution for "Grid"
 * Problem ID: grid
 * https://open.kattis.com/problems/grid
 */
public class Grid {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] line = scan.nextLine().split(" ");
    int r = Integer.parseInt(line[0]);
    int c = Integer.parseInt(line[1]);
    int[][] grid = new int[r][c];

    for (int x = 0; x < r; x++) {
      String nums = scan.nextLine();
      for (int y = 0; y < c; y++) {
        grid[x][y] = nums.charAt(y) - '0';
      }
    }

    int moves = bfs(grid, r, c);

    System.out.println(moves);
  }

  public static int bfs(int[][] grid, int r, int c) {
    boolean[][] visited = new boolean[r][c];
    Queue<int[]> queue = new LinkedList<int[]>();

    visited[0][0] = true;
    queue.add(new int[]{0, 0, 0});

    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      int row = curr[0];
      int col = curr[1];

      if (row == r - 1 && col == c - 1) {
        // Made it to bottom right
        return curr[2];
      }

      int jump = grid[row][col];

      // Up
      if (row - jump >= 0 && !visited[row - jump][col]) {
        queue.add(new int[]{row - jump, col, curr[2] + 1});
        visited[row - jump][col] = true;
      }

      // Down
      if (row + jump < r && !visited[row + jump][col]) {
        queue.add(new int[]{row + jump, col, curr[2] + 1});
        visited[row + jump][col] = true;
      }

      // Left
      if (col - jump >= 0 && !visited[row][col - jump]) {
        queue.add(new int[]{row, col - jump, curr[2] + 1});
        visited[row][col - jump] = true;
      }

      // Right
      if (col + jump < c && !visited[row][col + jump]) {
        queue.add(new int[]{row, col + jump, curr[2] + 1});
        visited[row][col + jump] = true;
      }
    }

    // No path found
    return -1;
  }
}
