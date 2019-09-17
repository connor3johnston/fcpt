import java.util.Scanner;
import java.util.TreeMap;

/**
 * Solution for "Un-bear-able Zoo"
 * Problem ID: zoo
 * https://open.kattis.com/problems/zoo
 */
public class Zoo {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int listCount = 1;

    /*
      This is a standard way to get input in CPT.
      We continue to take input until we are given the signal not to
    */
    int animalCount = Integer.parseInt(in.nextLine());

    while (animalCount != 0) {
      // We use a TreeMap because in the end we want to print in sorted order
      TreeMap<String,Integer> zoo = new TreeMap<String,Integer>();

      for (int x = 0; x < animalCount; x++) {
        String[] line = in.nextLine().split(" ");
        String animal = line[line.length - 1].toLowerCase();

        if (zoo.containsKey(animal)) {
          int sum = 1 + zoo.get(animal);
          zoo.put(animal, sum);
        } else {
          zoo.put(animal, 1);
        }
      }

      /*
        Use our print function, to make output easier.
        But read it and make sure you see what's going on!
      */
      print(zoo, listCount);
      listCount++;

      // This will determine if the program continues or terminates.
      animalCount = Integer.parseInt(in.nextLine());
    }
  }

  public static void print(TreeMap<String, Integer> animals, int listCount) {
    // Make sure you understand how this works!
    // Getting all the elements in a map
    //  is very different from arrays.
    // This is called a for-each loop
    System.out.println(String.format("List %s:", listCount));

    for (String animal : animals.keySet()) {
      System.out.println(animal + " | " + animals.get(animal));
    }
  }
}
