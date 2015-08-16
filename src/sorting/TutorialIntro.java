package sorting;

import java.util.Scanner;

public class TutorialIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			if (value == V) {
				System.out.println(i);
				break;
			}
		}
		sc.close();;
	}

}
