package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfThrones {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		int[] cnt = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			cnt[c - 'a']++;
		}
		int cntOdd = 0;
		for (int i = 0; i < 26; i++) {
			if (cnt[i] % 2 == 1) {
				cntOdd++;
			}
		}
		if (cntOdd <= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}

}
