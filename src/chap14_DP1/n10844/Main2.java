package chap14_DP1.n10844;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {
	static int N;
	static int count = 0;
	static int MAX = 0;
	static Integer[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		MAX = (int) Math.pow(10, N);

		arr = new Integer[MAX];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		
		if (N > 1) {
			arr[10] = 1;
			arr[11] = 0;
		}
		
		
		
		bw.write(String.valueOf(sol(String.valueOf(MAX - 1), N)));
		bw.flush();
		br.close();
		bw.close();

	}

	private static int sol(String N, int idx) {
		
		if (arr[Integer.parseInt(N)] == null) {

			if (N.charAt(idx) - '1' == N.charAt(idx + 1) - '0'
					|| N.charAt(idx) - '0' + 1 == N.charAt(idx + 1) - '0') {
				sol(N, idx - 1);
			}
			
		}
		
		return arr[Integer.parseInt(N)];


	}
	
}
