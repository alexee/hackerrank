package search;

import java.util.Scanner;

public class ConnectedCellInAGrid {

	static boolean[][] visited;
	static boolean[][] a;
	
	static int[] di = new int[] { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dj = new int[] { 0, 1, 1, 1, 0, -1, -1, -1 };
	static int n, m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new boolean[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j ++) {
				int x = sc.nextInt();
				a[i][j] = x == 1;
			}
		}
		int ret = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && a[i][j]) {
					int ans = go(i, j);
					ret = Math.max(ret, ans);
				}
			}
		}
		System.out.println(ret);
		sc.close();
	}

	private static int go(int i, int j) {
		int cnt = 1;
		visited[i][j] = true;
		for (int k = 0; k < 8; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if (ni >= 0 && nj >= 0 && ni < n && nj < m) {
				if (!visited[ni][nj] && a[ni][nj]) {
					cnt += go(ni, nj);
				}
			}
		}
		return cnt;
	}

}
