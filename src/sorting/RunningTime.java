package sorting;

import java.util.Scanner;

public class RunningTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0 ; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int shifts = 0;
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j > 0 && a[j] < a[j - 1]) {
				int t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
				j--;
				shifts++;
			}
		}
		System.out.println(shifts);
		sc.close();
	}

}
