import java.util.Scanner;
import java.util.HashSet;

/**
 * Template for "I've Been Everywhere, Man"
 * Product ID: everywhere
 * https://open.kattis.com/problems/everywhere
 */
public class Everywhere {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // We'll be using nextLine later, so we don't use nextInt.
    int testCaseCount = Integer.parseInt(in.nextLine());

    for (int testCase = 0; testCase < testCaseCount; testCase++) {
      // We want to get rid of duplicates, so a set is perfect!
      HashSet<String> cities = new HashSet<String>();

      /////////////////////////////
      /////YOUR CODE GOES HERE/////
      /////////////////////////////

      // This will output the number of unique cities.
      System.out.println(cities.size());
    }
  }
}
