package chap08_Math2.n9020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int T = 0;
		int N = 0;
		boolean isPrimeA = false;
		boolean isPrimeB = false;
		int A = 0, B = 0;

		Scanner scanner = new Scanner(System.in);

		T = scanner.nextInt();
		int[][] array = new int[T][2];

		for (int i = 0; i < T; i++) {
			N = scanner.nextInt();
			for (int j = 2; j <= N / 2; j++) {
				A = j;
				B = N - j;
				isPrimeA = true;
				isPrimeB = true;

				for (int k = 2; k <= Math.sqrt(A); k++) {
					if (A % k == 0) {
						isPrimeA = false;
						break;
					}

				}
				for (int k = 2; k <= Math.sqrt(B); k++) {
					if (B % k == 0) {
						isPrimeB = false;
						break;
					}

				}
				if (isPrimeA && isPrimeB) {
					array[i][0] = A;
					array[i][1] = B;
				}

			}

		}

		for (int i = 0; i < T; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}

}
