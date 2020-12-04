package chap05_array.n1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = 0;
		float MAX = 0;
		float SUM = 0;

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();

		float[] score = new float[N];
		float[] score_new = new float[N];

		for (int i = 0; i < N; i++) {
			score[i] = scanner.nextInt();
			if (score[i] >= MAX)
				MAX = score[i];
		}

		for (int i = 0; i < N; i++) {
			score_new[i] = (score[i] / MAX) * 100;
			SUM += score_new[i];
		}

		System.out.println(SUM / N);

	}

}
