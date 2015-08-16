package warmup;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TwoStrings {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int i =0 ; i < t; i++) {
			String first = in.readLine();
			String second = in.readLine();
			boolean found = false;
			for (char c = 'a'; c <= 'z'; c++) {
				if (first.indexOf(c) >= 0 && second.indexOf(c) >= 0) {
					found = true;
					break;
				}
			}
			System.out.println(found ? "YES" : "NO");
		}
	}

}
