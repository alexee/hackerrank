package warmup;
import java.util.Scanner;


public class CavityMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] a = new char[n][n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			a[i] = new char[n];
			for (int j = 0; j < n; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		int[] di = new int[] { 0, 0, 1, -1 };
		int[] dj = new int[] { 1, -1, 0, 0, };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > 0 && i < n - 1 && j > 0 && j < n - 1) {
					boolean good = true;
					for (int k = 0; k < 4; k++) {
						int ni = i + di[k];
						int nj = j + dj[k];
						if (a[ni][nj] >= a[i][j]) {
							good = false;
						}
					}
					if (good) {
						System.out.print('X');
					} else {
						System.out.print(a[i][j]);
					}
				} else {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
