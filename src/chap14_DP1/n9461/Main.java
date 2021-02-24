package chap14_DP1.n9461;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	static boolean[] check = new boolean[101];
	static long[] array = new long[101];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] num = new int[T + 1];

		for (int i = 1; i <= T; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 1; i <= T; i++) {
			bw.write(String.valueOf(func(num[i])) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	private static long func(int N) {

		if (N <= 3) {
			return array[N] = 1L;
		} else if (N <= 5) {
			return array[N] = 2L;
		} else {
			if (!check[N]) {
				check[N] = true;
				return array[N] = func(N - 2) + func(N - 3);
			} else {
				return array[N];
			}

		}

	}

}
