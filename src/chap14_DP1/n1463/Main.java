package chap14_DP1.n1463;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int RESULT = 100;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		sol(N, 0);

		bw.write(String.valueOf(RESULT));
		bw.flush();
		bw.close();
		br.close();
	}

	private static void sol(int N, int count) {

		if (N == 1) {
			RESULT = Math.min(count, RESULT);
			return;
		} else {
			if (N % 3 == 0) {
				sol(N / 3, count + 1);
			}
			if (N % 2 == 0) {
				sol(N / 2, count + 1);
			}
			sol(N - 1, count + 1);
			
		}
		

	}

}
