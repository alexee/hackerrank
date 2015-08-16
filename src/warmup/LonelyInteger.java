package warmup;
import java.util.Scanner;


public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int[101];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			cnt[a]++;
		}
		for (int i = 0; i < 101; i++) {
			if (cnt[i] == 1) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
