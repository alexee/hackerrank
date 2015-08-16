package strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				if (j > 0 && s.charAt(j) == s.charAt(j - 1)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
