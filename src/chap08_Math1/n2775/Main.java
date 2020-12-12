package chap08_Math1.n2775;

import java.util.Scanner;

public class Main {

	static int[][] array;

	public static void main(String[] args) {

		int T = 0;
		int A = 0, B = 0;

		Scanner scanner = new Scanner(System.in);

		T = scanner.nextInt();
		int[] count = new int[T];

		for (int i = 0; i < T; i++) {
			A = scanner.nextInt();
			B = scanner.nextInt();

			array = new int[A + 1][B + 1];
			for (int a = 1; a <= B; a++) {
				array[0][a] = a;
			}

			for (int j = 1; j <= A; j++) {
				for (int k = 1; k <= B; k++) {
					for (int l = 1; l <= k; l++) {
						array[j][k] += array[j - 1][l];
						count[i] = array[j][k];
					}

				}

			}
		}
		for (int a = 0; a < T; a++) {
			System.out.println(count[a]);
		}
	}

}
