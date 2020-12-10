package chap10_Recursive.n10870;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = 0;

		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();

		System.out.println(pivo(N));

	}

	private static int pivo(int N) {

		if (N == 0)
			return 0;
		if (N == 1)
			return 1;

		return pivo(N - 1) + pivo(N - 2);

	}

}
