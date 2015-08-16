package strings;

import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			String s = sc.next();
			if (s.length() % 2 == 1) {
				System.out.println(-1);
			} else {
				String a = s.substring(0, s.length() / 2);
				String b = s.substring(s.length() / 2);
				int[] cnt1 = new int[26];
				int[] cnt2 = new int[26];
				for (int i = 0; i < a.length(); i++) {
					cnt1[a.charAt(i) - 'a']++;
					cnt2[b.charAt(i) - 'a']++;
				}
				int ret = 0;
				for (int i = 0; i < 26; i++) {
					ret += Math.abs(cnt1[i] - cnt2[i]);
				}
				System.out.println(ret / 2);
			}
		}
		System.out.println();
	}

}
