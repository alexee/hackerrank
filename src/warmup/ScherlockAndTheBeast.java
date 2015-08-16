package warmup;
import java.util.Scanner;


public class ScherlockAndTheBeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			boolean found = false;
			for (int k5 = n/3; k5>=0; k5--) {
				int k3 = (n - k5 * 3) / 5;
				if (k3 * 5+ k5 * 3 == n) {
					found = true;
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < k5 * 3; j++) {
						sb.append("5");
					}
					for (int j = 0; j < k3 * 5; j++) {
						sb.append("3");
					}
					System.out.println(sb.toString());
					break;
				}
			}
			if (!found) {
				System.out.println(-1);
			}
		}
		sc.close();
	}

}
