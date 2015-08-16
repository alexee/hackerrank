package warmup;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class IsFibo {

	public static void main(String[] args) {
		Set<Long> fibs = new HashSet<Long>();
		fibs.add(0L);
		fibs.add(1L);
		long prev1 = 0L;
		long prev2 = 1L;
		while (true) {
			long next = prev1 + prev2;
			fibs.add(next);
			prev1 = prev2;
			prev2 = next;
			if (next > 1e10) {
				break;
			}
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long f = sc.nextLong();
			boolean contains = fibs.contains(f);
			if (contains) {
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
			}
		}
		sc.close();
	}

}
