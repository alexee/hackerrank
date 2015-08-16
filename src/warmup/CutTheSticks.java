package warmup;
import java.util.Scanner;


public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while (true) {
			int min = -1;
			for (int i = 0; i < n; i++) {
				if (a[i] > 0 && (min == -1 || a[i] < min)) {
					min = a[i];
				}
			}
			if (min == -1) {
				break;
			}
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					a[i] -= min;
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
