package dynamicprogramming;

import java.util.Scanner;

public class MaxSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int T = 0; T < t; T++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sumNonContiguous = -Integer.MAX_VALUE;
			int sumContiguous = -Integer.MAX_VALUE;
			int partialSum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] > 0) {
					sumNonContiguous += a[i];
				}
				if (partialSum + a[i] > 0) {
					partialSum = partialSum + a[i];
					sumContiguous = Math.max(sumContiguous, partialSum);
				} else {
					partialSum = 0;
				}
				sumNonContiguous = Math.max(sumNonContiguous, a[i]);
				sumContiguous = Math.max(sumContiguous, a[i]);
			}
			System.out.println(sumContiguous + " " + sumNonContiguous);
		}
		sc.close();
	}

}
