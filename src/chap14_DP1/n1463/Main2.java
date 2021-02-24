package chap14_DP1.n1463;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	static int RESULT = 100;
	static Integer[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		arr = new Integer[N + 1];
		arr[0] = arr[1] = 0;

		bw.write(String.valueOf(sol(N)));
		bw.flush();
		bw.close();
		br.close();
	}

	private static int sol(int N) {

		if (arr[N] == null) {
			if (N % 6 == 0) {
				arr[N] = Math.min(sol(N - 1), Math.min(sol(N / 3), sol(N / 2))) + 1;
			} else if (N % 3 == 0) {
				arr[N] = Math.min(sol(N - 1), sol(N / 3)) + 1;
			} else if (N % 2 == 0) {
				arr[N] = Math.min(sol(N - 1), sol(N / 2)) + 1;
			} else {
				arr[N] = sol(N - 1) + 1;
			}
		}
		return arr[N];

	}

}
