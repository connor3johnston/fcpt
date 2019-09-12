import java.util.Scanner;
import java.util.HashSet;

/**
 * Solution for "I've Been Everywhere, Man"
 * Product ID: everywhere
 * https://open.kattis.com/problems/everywhere
 */
public class Everywhere {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // We'll be using nextLine later, so we don't use nextInt
    int testCaseCount = Integer.parseInt(in.nextLine());

    for (int testCase = 0; testCase < testCaseCount; testCase++) {
      // We want to get rid of duplicates, so a set is perfect!
      HashSet<String> cities = new HashSet<String>();

      int numCities = Integer.parseInt(in.nextLine());
      for (int y = 0; y < numCities; y++) {
        cities.add(in.nextLine());
      }

      System.out.println(cities.size());
    }
  }
}
