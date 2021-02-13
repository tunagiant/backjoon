package chap14_DP1.n1932;

import java.util.Scanner;

public class Main2 {

	static int N = 0;
	static int[][] arr;
	static Integer[][] dp;
	static int RESULT = 0;
	static boolean[] check;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			dp[N - 1][i] = arr[N - 1][i];
		}

		System.out.print(sol(0, 0));

	}

	private static int sol(int depth, int idx) {

		if (depth == N - 1) {
			return dp[depth][idx];
		}

		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(sol(depth - 1, idx + 1), sol(depth - 1, idx)) + arr[depth][idx];
		}
		return dp[depth][idx];

	}
}
