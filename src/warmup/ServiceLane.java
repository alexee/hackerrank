package warmup;
import java.util.Scanner;


public class ServiceLane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] width = new int[n];
		for (int i = 0; i < n; i++) {
			width[i] = sc.nextInt();
		}
		for (int T = 0; T < t; T++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			for (int type = 3; type >= 1; type--) {
				boolean good = true;
				for (int k = i; k <= j; k++) {
					if (width[k] < type) {
						good = false;
						break;
					}
				}
				if (good) {
					System.out.println(type);
					break;
				}
			}
		}
		sc.close();
	}

}
