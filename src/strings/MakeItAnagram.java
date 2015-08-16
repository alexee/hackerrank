package strings;

import java.util.Scanner;

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		for (int i = 0; i < first.length(); i++) {
			char c = first.charAt(i);
			cnt1[c - 'a']++;
		}
		for (int i = 0; i < second.length(); i++) {
			char c = second.charAt(i);
			cnt2[c - 'a']++;
		}
		int ret = 0;
		for (int i = 0; i < 26; i++) {
			ret += Math.abs(cnt1[i] - cnt2[i]);
		}
		System.out.println(ret);
		sc.close();
	}

}
