import java.util.Scanner;
import java.util.TreeMap;

/**
 * Template for "Un-bear-able Zoo"
 * Problem ID: zoo
 * https://open.kattis.com/problems/zoo
 */
public class Zoo {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int listCount = 1;

    // This is a standard way to get input in CPT.
    // We continue to take input until we are given the signal not to.
    int animalCount = Integer.parseInt(in.nextLine());

    while (animalCount != 0) {
      // Use a TreeMap to maintain sorted order.
      TreeMap<String,Integer> zoo = new TreeMap<String,Integer>();

      /////////////////////////////
      /////YOUR CODE GOES HERE/////
      /////////////////////////////

      /*
        Use our print function, to make output easier.
        But go read it and make sure you see what's going on!
      */
      print(zoo, listCount);
      listCount++;

      // This will determine if the program continues or terminates.
      animalCount = Integer.parseInt(in.nextLine());
    }
  }

  /**
   * Make sure you understand how this works!
   * Getting all the elements in a map is very different from arrays.
   */
  public static void print(TreeMap<String, Integer> animals, int listCount) {
    System.out.println(String.format("List %s:", listCount));

    // This is called a for-each loop.
    for (String animal : animals.keySet()) {
      System.out.println(animal + " | " + animals.get(animal));
    }
  }
}
