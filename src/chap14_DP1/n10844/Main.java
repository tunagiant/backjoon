package chap14_DP1.n10844;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int count = 0;
	static int MAX = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		MAX = (int) Math.pow(10, N);

		for (int i = (int) Math.pow(10, N - 1); i < MAX; i++) {
			sol(String.valueOf(i), 0);
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();

	}

	private static void sol(String num, int index) {

		if (index == N) {
			count++;
			return;
		}

		for (int i = index; i < N - 1; i++) {
			if (num.charAt(i) - '1' == num.charAt(i + 1) - '0'
					|| num.charAt(i) - '0' + 1 == num.charAt(i + 1) - '0') {
				sol(num, index + 1);
			}
		}

	}
	
}
