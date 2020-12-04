package chap05_array.n4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int N = 0;
		int SUM = 0;
		float count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		String[] Line = new String[N];
		float[] result = new float[N];

		for (int i = 0; i < N; i++) {
			Line[i] = br.readLine();
			String[] score = Line[i].split(" ");

			for (int j = 1; j <= Integer.parseInt(score[0]); j++) {
				SUM += Integer.parseInt(score[j]);
			}

			for (int k = 1; k <= Integer.parseInt(score[0]); k++) {
				if (Integer.parseInt(score[k]) > SUM / Integer.parseInt(score[0])) {
					count++;
				}
			}
			result[i] = count / (float)Integer.parseInt(score[0]) * 100;
			count = 0;
			SUM = 0;
		}
		
		for (int i = 0; i < N; i ++) {
			System.out.printf("%.3f%%\n", result[i]);
		}

	}

}
