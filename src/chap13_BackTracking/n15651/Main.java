package chap13_BackTracking.n15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static StringBuffer sb = new StringBuffer();
	public static int N, M;
	public static int[] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = br.read() - '0';
		br.read();
		M = br.read() - '0';

		arr = new int[M];
		dfs(0);
		System.out.println(sb);

	}

	public static void dfs(int depth) {

		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i + 1;
			dfs(depth + 1);
		}
	}

}