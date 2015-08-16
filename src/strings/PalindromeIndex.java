package strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int ret = -1;
			String s = sc.next();
			for (int j = 0; j < s.length() / 2; j++) {
				char c = s.charAt(j);
				char opp = s.charAt(s.length() - j - 1);
				if (c != opp) {
					System.out.println(c + " " + opp + " " + s.charAt(s.length() - j - 2));
					if (c == s.charAt(s.length() - j - 2)) {
						ret = s.length() - j - 1;
					} else {
						ret = j;
					}
					break;
				}
			}
			System.out.println(ret);
		}
		sc.close();
	}

}
