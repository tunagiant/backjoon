package chap08_Math2.n1002;

import java.util.Scanner;

public class Main {
	static int[] answer;

	public static void main(String[] args) {

		int T = 0;
		int x1 = 0, y1 = 0, r1 = 0, x2 = 0, y2 = 0, r2 = 0;

		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		answer = new int[T];

		for (int i = 0; i < T; i++) {

			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			r1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			r2 = scanner.nextInt();
			answer[i] = func(x1, y1, r1, x2, y2, r2);
		}

		for (int i = 0; i < T; i++) {
			System.out.println(answer[i]);
		}

	}

	private static int func(int x1, int y1, int r1, int x2, int y2, int r2) {

		int dis_pow = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		} else if (dis_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		} else if (dis_pow < Math.pow(r1 - r2, 2)) {
			return 0;
		} else if (dis_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		} else if (dis_pow == Math.pow(r1 - r2, 2)) {
			return 1;
		} else {
			return 2;
		}
	}

}
