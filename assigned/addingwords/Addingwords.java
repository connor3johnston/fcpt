import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Solution for "Adding Words"
 * Problem ID: addingwords
 * https://open.kattis.com/problems/addingwords
 */
public class Addingwords {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    HashMap<String, Integer> wordToValue = new HashMap<String, Integer>();
    HashMap<Integer, String> valueToWord = new HashMap<Integer, String>();

    while (scan.hasNextLine()) {
      String[] line = scan.nextLine().split(" ");
      if (line[0].equals("clear")) {
        wordToValue.clear();
        valueToWord.clear();
      } else if (line[0].equals("calc")) {
        String result = calc(wordToValue, valueToWord, line);

        System.out.println(String.format("%s %s", String.join(" ", Arrays.copyOfRange(line, 1, line.length)), result));
      } else {
        if (wordToValue.containsKey(line[1])) {
          valueToWord.remove(wordToValue.get(line[1]));
        }

        wordToValue.put(line[1], Integer.parseInt(line[2]));
        valueToWord.put(Integer.parseInt(line[2]), line[1]);
      }
    }
  }

  public static String calc(HashMap<String, Integer> wordToValue, HashMap<Integer, String> valueToWord, String[] calculation) {
    for (int x = 1; x < calculation.length - 1; x += 2) {
      if (!wordToValue.containsKey(calculation[x])) {
        return "unknown";
      }
    }

    int answer = wordToValue.get(calculation[1]);

    for (int y = 2; y < calculation.length - 2; y += 2) {
      if (calculation[y].equals("+")) {
        answer += wordToValue.get(calculation[y + 1]);
      } else if (calculation[y].equals("-")) {
        answer -= wordToValue.get(calculation[y + 1]);
      }
    }

    if (valueToWord.containsKey(answer)) {
      return valueToWord.get(answer);
    }

    return "unknown";
  }
}
