package chap13_BackTracking.n14888;

import java.util.Scanner;

public class Main {

	static int[] num;
	static int[] op;
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	static int N = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();

		num = new int[N];
		op = new int[4];

		for (int i = 0; i < N; i++) {
			num[i] = scanner.nextInt();
		}

		// 0µ¡¼À 1»¬¼À 2°ö¼À 3³ª´°¼À
		for (int i = 0; i < 4; i++) {
			op[i] = scanner.nextInt();
		}

		cal(num[0], 1);
		System.out.println(MAX + "\n" + MIN);

	}

	private static void cal(int n, int index) {

		if (index == N) {

			MAX = Math.max(MAX, n);
			MIN = Math.min(MIN, n);
		}

		for (int i = 0; i < 4; i++) {
			if (op[i] > 0) {
				op[i]--;
				switch (i) {
				case 0:
					cal(n + num[index], index + 1);
					break;
				case 1:
					cal(n - num[index], index + 1);
					break;
				case 2:
					cal(n * num[index], index + 1);
					break;
				case 3:
					cal(n / num[index], index + 1);
					break;
				}
				op[i]++;
			}
		}

	}
}
