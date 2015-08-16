package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BiggerIsGreater {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int k = 0; k < t; k++) {
			String w = in.readLine();
			int j = -1;
			for (int i = w.length() - 2; i >= 0; i--) {
				if (w.charAt(i) < w.charAt(i + 1)) {
					j = i;
					break;
				}
			}
			if (j >= 0) {
				
			} else {
				System.out.println("no answer");
			}
		}
	}

}
