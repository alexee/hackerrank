package warmup;
import java.util.Scanner;


public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for (int i = 0; i < t; i++) {
			long n = sc.nextLong();
			String s = Long.toString(n);
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				int digit = (int)(s.charAt(j) - '0');
				if (digit != 0 && n % digit == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
