package sorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int value = a[n - 1];
		int i = n - 2;
		while (i >= 0) {
			if (a[i] > value) {
				a[i + 1] = a[i];
				for (int j = 0; j < n; j++) {
					System.out.print(a[j] + " " );
				}
				System.out.println();
			} else {
				break;
			}
			i--;
		}
		i++;
		for (int j = 0; j < n; j++) {
			if (j == i) {
				System.out.print(value);
			} else {
				System.out.print(a[j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		sc.close();
	}

}
