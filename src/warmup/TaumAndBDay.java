package warmup;
import java.util.Scanner;


public class TaumAndBDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long b = sc.nextLong();
			long w = sc.nextLong();
			
			long priceBlack = sc.nextLong();
			long priceWhite = sc.nextLong();
			long z = sc.nextLong();
			
			if (priceBlack + z < priceWhite) {
				System.out.println(priceBlack * b + (priceBlack + z) * w);
			} else if (priceWhite + z < priceBlack) {
				System.out.println((priceWhite + z)*b + priceWhite *w);
			} else {
				System.out.println(priceBlack * b + priceWhite * w);
			}
		}
		sc.close();;
	}

}
