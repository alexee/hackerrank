package warmup;
import java.util.Scanner;


public class FillingJars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long total = 0;
		for (int i = 0; i < m ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			total += (long) (b - a + 1) * k;
		}
		System.out.println(total/n);
		sc.close();
	}

}
