package warmup;
import java.util.Scanner;


public class ScherlockAndSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = 1;
			int cnt = 0;
			while (true) {
				long val = x * x;
				if (val >= a && val <= b) {
					cnt++;
				}
				if (val > b) {
					break;
				}
				x++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
