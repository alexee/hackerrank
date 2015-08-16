package combinatorics;

import java.util.Scanner;

public class StrangeGrid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long c = sc.nextLong();
		r--;
		c--;
		if (r % 2 == 0) {
			System.out.println(c * 2  + (r/2)*10);
		} else {
			System.out.println((c*2) + 1 + ((r - 1)/2)*10);
		}
		sc.close();
	}

}
