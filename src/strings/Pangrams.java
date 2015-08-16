package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Character> set = new HashSet<Character>();
		while (sc.hasNext()) {
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				set.add(Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println(set.size() == 26 ? "pangram" : "not pangram");
		sc.close();
	}

}
