import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for "ABC"
 * Problem ID: abc
 * https://open.kattis.com/problems/abc
 */
public class ABC {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] threenums = new int[3];

    for (int x = 0; x < 3; x++) {
      threenums[x] = scan.nextInt();
    }

    scan.nextLine();
    Arrays.sort(threenums);
    String line = scan.nextLine();

    for (int y = 0; y < 3; y++) {
      System.out.print(threenums[line.charAt(y)-65] + " ");
    }

    System.out.println();
  }
}
