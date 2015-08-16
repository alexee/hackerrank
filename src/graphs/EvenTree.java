package graphs;

import java.util.Scanner;

public class EvenTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] a = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			a[i] = new boolean[n];
		}
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			a[u][v] = true;
			a[v][u] = true;
		}
		int ret = 0;
		while (true) {
			boolean changed = false;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i][j]) {
						int size1 = getSubTreeSize(i, j, a);
						int size2 = getSubTreeSize(j, i, a);
						if (size1 % 2 == 0 && size2 % 2 == 0) {
							ret++;
							a[i][j] = false;
							a[j][i] = false;
							changed = true;
						}
					}
				}
			}
			if (!changed) {
				break;
			}
		}
		System.out.println(ret);
		sc.close();
	}

	private static int getSubTreeSize(int i, int prev, boolean[][] a) {
		int ret = 1;
		for (int j = 0; j < a.length; j++) {
			if (a[i][j] && j != prev) {
				ret += getSubTreeSize(j, i, a);
			}
		}
		return ret;
	}

}
