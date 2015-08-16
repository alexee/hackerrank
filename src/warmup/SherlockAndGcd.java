package warmup;
import java.util.Scanner;


public class SherlockAndGcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			boolean found = false;
			for (int k = 0; k < n - 1; k++) {
				for (int j = k + 1; j < n; j++) {
					if (gcd(a[k], a[j]) == 1) {
						found = true;
						break;
					}
				}
				if (found) {
					break;
				}
			}
			if (found) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
