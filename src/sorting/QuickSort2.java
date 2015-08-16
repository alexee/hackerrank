package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		quickSort(a);
		sc.close();
	}

	private static List<Integer> quickSort(List<Integer> a) {
		if (a.size() <= 1) {
			return a;
		} else {
			int pivot = a.get(0);
			List<Integer> left = new ArrayList<Integer>();
			List<Integer> right = new ArrayList<Integer>();
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) < pivot) {
					left.add(a.get(i));
				} else if (a.get(i) > pivot){
					right.add(a.get(i));
				}
			}
			List<Integer> sortedLeft = quickSort(left);
			List<Integer> sortedRight = quickSort(right);
			List<Integer> ret = new ArrayList<Integer>();
			ret.addAll(sortedLeft);
			ret.add(pivot);
			ret.addAll(sortedRight);
			for (int i = 0; i < ret.size(); i++) {
				System.out.print(ret.get(i) + " ");
			}
			System.out.println();
			return ret;
		}
	}

}
