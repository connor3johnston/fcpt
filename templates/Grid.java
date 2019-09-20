import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Template for "Grid"
 * Problem ID: grid
 * https://open.kattis.com/problems/grid
 */
public class Grid {
  public static void main(String[] args) {
    // The template is going to gather all input for you.
    // It will also set up your grid to minimize hassle.
    // You will write the BFS.
    Scanner scan = new Scanner(System.in);

    // Gets the number of rows and columns of your grid.
    String[] line = scan.nextLine().split(" ");
    int rows = Integer.parseInt(line[0]);
    int cols = Integer.parseInt(line[1]);

    // Declare and populate your grid.
    int[][] grid = new int[rows][cols];
    for (int x = 0; x < rows; x++) {
      String nums = scan.nextLine();
      for (int y = 0; y < cols; y++) {
        grid[x][y] = nums.charAt(y) - '0';
      }
    }

    // The bfs is going to return the number of moves.
    int moves = bfs(grid, rows, cols);

    System.out.println(moves);
  }

  public static int bfs(int[][] grid, int rows, int cols) {
    // Here is your visited array and your queue.
    boolean[][] visited = new boolean[rows][cols];
    Queue<int[]> queue = new LinkedList<int[]>();

    // The top left corner has been handled for you.
    // Each int[] contains {row, col, movesSoFar}.
    // You can alter it to fit your liking.
    // The rest is up to you.
    // Write your Breadth-First Search below.
    queue.add(new int[]{0, 0, 0});
    visited[0][0] = true;

      /////////////////////////////
      /////YOUR CODE GOES HERE/////
      /////////////////////////////

    return  -1;
  }
}
