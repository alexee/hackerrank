package strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int T = 0; T < t; T++) {
			boolean funny = true;
			String s = sc.next();
			for (int i = 1; i < s.length(); i++) {
				char s_1 = s.charAt(i);
				char s_2 = s.charAt(i - 1);
				int  r_i = s.length() - i;
				char r_1 = s.charAt(r_i);
				char r_2 = s.charAt(r_i - 1);
				funny &= Math.abs(s_1 - s_2) == Math.abs(r_1 - r_2);
			}
			System.out.println(funny ? "Funny" : "Not Funny");
		}
		sc.close();
	}

}
