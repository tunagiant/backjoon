package chap08_Math2.n1978;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T = 0;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		int[] array = new int[T];

		for (int i = 0; i < T; i++) {
			array[i] = scanner.nextInt();
			if (array[i] != 1) {
				count++;
				for (int j = 2; j <= Math.sqrt(array[i]); j++) {
					if (array[i] % j == 0) {
						count--;
						break;
					}

				}

			}

			System.out.println(count);

		}

	}
}
