import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Solution for "What does the fox say?"
 * Problem ID: whatdoesthefoxsay
 * https://open.kattis.com/problems/whatdoesthefoxsay
 */
public class WhatDoesTheFoxSay {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = Integer.parseInt(in.nextLine());

    for (int x = 0; x < cases; x++) {
      String[] line = in.nextLine().split(" ");
      ArrayList<String> allSoundsHeard = new ArrayList<String>(Arrays.asList(line));
      String nextAnimal = in.nextLine();

      while (!nextAnimal.equals("what does the fox say?")) {
        String[] animalSound = nextAnimal.split(" goes ");
        String sound = animalSound[1];

        while (allSoundsHeard.contains(sound)) {
          allSoundsHeard.remove(sound);
        }

        nextAnimal = in.nextLine();
      }

      System.out.println(String.join(" ", allSoundsHeard));
    }
  }
}
