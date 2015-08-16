package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int p = a[0];
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (a[i] < p) {
				left.add(a[i]);
			} else {
				right.add(a[i]);
			}
		}
		for (int i = 0; i < left.size(); i++) {
			System.out.print(left.get(i) + " ");
		}
		for (int i = 0; i < right.size(); i++) {
			System.out.print(right.get(i) + " ");
		}
		sc.close();
	}

}
