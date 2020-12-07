package chap08_Math1.n2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = 0;
		int count = 1;
		int range = 2;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();

		if (N == 1) {
			System.out.println(1);
		} else {
			while (range <= N) {
				range = range + (6 * count);
				count++;
			}

			System.out.println(count);
		}

	}
}
