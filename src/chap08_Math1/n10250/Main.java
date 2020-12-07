package chap08_Math1.n10250;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int T = 0;
		int H = 0, W = 0, N = 0;
		int x = 0, y = 0;
		Scanner scanner = new Scanner(System.in);

		T = scanner.nextInt();
		int[] num = new int[T];

		for (int i = 0; i < T; i++) {
			H = scanner.nextInt();
			W = scanner.nextInt();
			N = scanner.nextInt();
			
			if (N % H != 0) {
				x = N % H;
				y = (N / H) + 1;
			} else {
				x = H;
				y = (N / H);
			}
			num[i] = 100 * x + y;
		}

		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);

	}

}
