import java.util.HashSet;
import java.util.Scanner;

/**
 * Solution for "Shiritori"
 * Problem ID: shiritori
 * https://open.kattis.com/problems/shiritori
*/
public class Shiritori {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    HashSet<String> seen = new HashSet<String>();

    int wordCount = Integer.parseInt(scan.nextLine());
    String start = scan.nextLine();
    char last = start.charAt(start.length() - 1);

    seen.add(start);

    int player = 1;
    while (player < wordCount) {
      String word = scan.nextLine();
      char first = word.charAt(0);

      if (seen.contains(word) || first != last) {
        break;
      }

      seen.add(word);
      last = word.charAt(word.length() - 1);
      player++;
    }

    if (player == wordCount) {
      System.out.println("Fair Game");
    } else if (player % 2 == 1) {
      System.out.println("Player 2 lost");
    } else {
      System.out.println("Player 1 lost");
    }
  }
}
