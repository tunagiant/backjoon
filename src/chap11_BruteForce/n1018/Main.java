package chap11_BruteForce.n1018;

import java.util.Scanner;

public class Main {

	static char[][] base;
	static int MIN = 64;
	static char[][] check = { "WBWBWBWB".toCharArray(), "BWBWBWBW".toCharArray() };

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		scanner.nextLine();		// \n Á¦°Å

		String str;
		base = new char[N][M];

		for (int i = 0; i < N; i++) {
			str = scanner.nextLine().trim();

			for (int j = 0; j < M; j++) {
				base[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				find(i, j);
			}
		}

		System.out.println(MIN);

	}

	private static int find(int x, int y) {


		for (int i = 0; i < 2; i++) {
			int count = 0;
			for (int j = 0; j < 8; j++) { // N
				for (int k = 0; k < 8; k++) { // M
					if (base[x + j][y + k] != check[(i + j) % 2][k]) {
						count++;

					}
				}
			}
			if (count <= MIN) {
				MIN = count;
			}
		}
		return MIN;

	}

}
