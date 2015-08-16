package strings;

import java.util.Arrays;
import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] good = new boolean[26];
		Arrays.fill(good, true);
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			
			boolean[] newGood = new boolean[26];
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				newGood[c- 'a'] = true;
			}
			for (int j = 0; j < 26; j++) {
				good[j] &= newGood[j];
			}
		}
		int cnt = 0;
		for (int j = 0; j < 26; j++) {
			if (good[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
