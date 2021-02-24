package chap14_DP1.n2579;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/* testcase
6
10
20
15
25
10
20
 */

public class Main2 {
	static int[] arr;
	static Integer[] dp;
	static int RESULT = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		dp = new Integer[N + 1];

		for (int i = 1; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = arr[0];	// 0 으로 초기화
		dp[1] = arr[1];
		
		if (N >= 2) {
			dp[2] = arr[1] + arr[2];
		}

		bw.write(String.valueOf(sol(N)));
		bw.flush();
		bw.close();
		br.close();

	}

	private static int sol(int N) {

		if (dp[N] == null) {
			dp[N] = Math.max(sol(N - 2), sol(N - 3) + arr[N - 1]) + arr[N];
		}
		
		return dp[N];

	}

}
