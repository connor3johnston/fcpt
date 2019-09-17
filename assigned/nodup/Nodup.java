import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Solution for "No Duplicates"
 * Problem ID: nodup
 * https://open.kattis.com/problems/nodup
 */
public class Nodup {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] phrase = scan.nextLine().split(" ");
    HashSet<String> filter = new HashSet<String>(Arrays.asList(phrase));

    if (filter.size() < phrase.length) {
      System.out.println("no");
    } else {
      System.out.println("yes");
    }
  }
}
