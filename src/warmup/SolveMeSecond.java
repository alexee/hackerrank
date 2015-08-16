package warmup;


import java.util.Scanner;

public class SolveMeSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
	}

}
