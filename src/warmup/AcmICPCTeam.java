package warmup;
import java.util.Scanner;


public class AcmICPCTeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] a = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String s =sc.next();
			a[i] = new boolean[m];
			for (int j = 0; j < m;j++) {
				a[i][j] = s.charAt(j) == '1';
			}
		}
		int max = 0;
		int maxCnt = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int cnt = 0;
				for (int k = 0; k < m; k++) {
					if (a[i][k] || a[j][k]) {
						cnt++;
					}
				}
				if (cnt > max) {
					max = cnt;
					maxCnt = 1;
				} else if (cnt == max) {
					maxCnt++;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxCnt);
		sc.close();
	}

}
