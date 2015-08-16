package search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayingWithNumbers {

	static int max = 2000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split(" ");
		int[] a = new int[n];
		int[] cnts = new int[max * 2 + 1];
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(s[i]);
			a[i] = x;
			incCnts(cnts, a[i]);
		}
		int q = Integer.parseInt(in.readLine());
		String[] xs = in.readLine().split(" ");
		int shift = 0;
		for (int i = 0; i < xs.length; i++) {
			int x = Integer.parseInt(xs[i]);
			shift += x;
			long sum = 0;
			for (int k = -max; k <= max; k++) {
				sum += cnts[k + max] * Math.abs(k + shift);
			}
			System.out.println(sum);
		}
		in.close();
	}

	private static void incCnts(int[] cnts, int val) {
		val += max;
		cnts[val]++;
	}

}
