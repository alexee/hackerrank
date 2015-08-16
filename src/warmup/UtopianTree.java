package warmup;
import java.util.Scanner;


public class UtopianTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long height = 1;
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0) {
					height *= 2;
				} else {
					height++;
				}
			}
			System.out.println(height);
		}
		sc.close();
	}

}
