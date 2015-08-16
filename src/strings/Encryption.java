package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int L = line.length();
		int lower = (int) Math.floor(Math.sqrt(L));
		int upper = (int) Math.ceil(Math.sqrt(L));
		int minArea = -1;
		int mrows = -1;
		int mcolumns = -1;
		for (int rows = lower; rows <= upper; rows++) {
			for (int columns = rows; columns <= upper; columns++) {
				if (rows * columns >= L) {
					if (minArea == -1 || minArea > rows * columns) {
						minArea = rows * columns;
						mrows = rows;
						mcolumns = columns;
					}
				}
			}
		}
		char[][] matrix = new char[mrows][mcolumns];
		for (int i = 0; i < mrows; i++) {
			matrix[i] = new char[mcolumns];
			Arrays.fill(matrix[i], ' ');
		}
		int cnt = 0;
		for (int i = 0 ; i < mrows; i++) {
			for (int j = 0; j < mcolumns; j++) {
				if (cnt < line.length()) {
					matrix[i][j] = line.charAt(cnt++);
				}
			}
		}
		List<String> words = new ArrayList<String>();
		for (int j = 0; j < mcolumns; j++) {
			int i = 0;
			String word = "";
			while (i < mrows && matrix[i][j] != ' ') {
				word = word + matrix[i][j];
				i++;
			}
			words.add(word);
		}
		for (int i = 0; i < words.size(); i++) {
			System.out.print(words.get(i));
			if (i < words.size() - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
