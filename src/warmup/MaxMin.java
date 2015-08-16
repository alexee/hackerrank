package warmup;
import java.util.Arrays;
import java.util.Scanner;


public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ret = a[n - 1] - a[0];
		for (int i = 0; i < n; i++) {
			if (i + k - 1 < n) {
				int max = a[i + k - 1];
				int min = a[i];
				ret = Math.min(ret, max - min);
			}
		}
		System.out.println(ret);
		sc.close();
	}

}
