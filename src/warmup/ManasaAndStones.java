package warmup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			for (int cntA = 0; cntA <= n - 1; cntA++) {
				int cntB = n - 1 - cntA;
				int ret = cntA * a + cntB * b;
				set.add(ret);
			}
			List<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
