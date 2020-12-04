package chap05_array.n8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int N = 0;
		boolean isContinue = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		String[] Line = new String[N];
		int[] result = new int[Line.length];

		for (int i = 0; i < N; i++) {
			Line[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			int[] score = new int[Line[i].length()];

			for (int j = 0; j < Line[i].length(); j++) {
				if (Line[i].charAt(j) == 'O') {
					if (isContinue) {
						score[j] = score[j - 1] + 1;
					} else {
						score[j]++;
						isContinue = true;
					}
				} else {
					isContinue = false;
				}
				result[i] += score[j];
			}
			isContinue = false;

		}

		for (int i = 0; i < N; i++)
			System.out.println(result[i]);

	}

}
