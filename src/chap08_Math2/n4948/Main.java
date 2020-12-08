package chap08_Math2.n4948;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = -1;
		boolean isPrime;

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> count = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		while (N != 0) {
			N = scanner.nextInt();
			for (int i = N + 1; i <= 2 * N; i++) {
				isPrime = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						isPrime = false;
						break;

					}
				}
				if (isPrime) {
					list.add(i);
				}

			}
			count.add(list.size());
			list.clear();
		}
		
		for (int i = 0; i < count.size() - 1; i++) {
			System.out.println(count.get(i));
		}

	}

}
