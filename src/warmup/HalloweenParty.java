package warmup;
import java.util.Scanner;


public class HalloweenParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			long down = k/2;
			long up = k - down;
			System.out.println(down * up);
		}
		sc.close();
	}

}
