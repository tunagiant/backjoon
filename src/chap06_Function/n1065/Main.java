package chap06_Function.n1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static boolean[] isAnswer;

	public static void main(String[] args) throws NumberFormatException, IOException {

		int N = 0;
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		isAnswer = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {

			if (i == 1000) {
				num(999);
				break;
			} else {
				num(i);

			}
		}

		for (int i = 1; i <= N; i++) {
			if (isAnswer[i])
				count++;
		}

		System.out.println(count);

	}

	private static void num(int N) {

		int dN = N;
		int[] position = new int[3];
		int i = 0;

		while (dN > 0) {
			position[i] = dN % 10;
			dN /= 10;
			i++;
		}

		if (N >= 100) {
			if ((position[0] - position[1]) == (position[1] - position[2]))
				isAnswer[N] = true;
		} else {
			isAnswer[N] = true;
		}

	}

}
