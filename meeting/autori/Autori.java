import java.util.Scanner;

/**
 * Solution for "Autori"
 * Problem ID: autori
 * https://open.kattis.com/problems/autori
 */
public class Autori {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String line = scan.nextLine();
		String output = "";

		for (int x = 0; x < line.length(); x++) {
			if (Character.isUpperCase(line.charAt(x))) {
				output += line.charAt(x);
			}
		}

		System.out.println(output);
	}
}
