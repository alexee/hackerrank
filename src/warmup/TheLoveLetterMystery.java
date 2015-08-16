package warmup;
import java.util.Scanner;


public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			int ret =0;
			for (int j = 0; j < s.length() / 2; j++) {
				char c = s.charAt(j);
				char other = s.charAt(s.length() - j - 1);
				ret += Math.abs(other - c);
			}
			System.out.println(ret);
		}
		sc.close();
	}

}
