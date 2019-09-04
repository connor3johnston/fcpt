/*
Rating: ~ 1.5 / 10
Link: https://open.kattis.com/problems/mixedfractions
*/

import java.io.*;
import java.util.*;

public class Mixedfractions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] line = scan.nextLine().split(" ");
		int num = Integer.parseInt(line[0]);
		int denom = Integer.parseInt(line[1]);

		while (num != 0 && denom != 0) {
			int whole = num/denom;
			int remain = num%denom;

			System.out.println(whole + " " + remain + " / " + denom);

			line = scan.nextLine().split(" ");
			num = Integer.parseInt(line[0]);
			denom = Integer.parseInt(line[1]);
		}
	}
}
