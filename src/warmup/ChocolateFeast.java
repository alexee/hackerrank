package warmup;
import java.util.Scanner;


public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			int money = n;
			int total = 0;
			int wrappers = 0;
			while (true) {
				int cnt = money / c;
				money = money - cnt * c;
				if (cnt == 0) {
					break;
				}
				total += cnt;
				wrappers += cnt;
				while (wrappers / m > 0) {
					int add = wrappers / m;
					wrappers -= add *m;
					wrappers += add;
					total += add;
				}
			}
			System.out.println(total);
		}
		sc.close();
	}

}
