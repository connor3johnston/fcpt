/*
Rating: ~ 1.5 / 10
Link: https://open.kattis.com/problems/babybites
*/

import java.io.*;
import java.util.*;

public class Babybites {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int count_to = Integer.parseInt(scan.nextLine());
    String[] line = scan.nextLine().split(" ");

    for (int x = 1; x <= count_to; x++) {
      if (line[x-1].equals("mumble")) {
        continue;
      }

      if (Integer.parseInt(line[x-1]) != x) {
        System.out.println("something is fishy");
        return;
      }
    }

    System.out.println("makes sense");
  }
}
