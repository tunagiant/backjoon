package chap13_BackTracking.n15652;

import java.util.Scanner;

public class Main {

	public static int[] arr;
	public static int N, M;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		N = in.nextInt();
		M = in.nextInt();

		arr = new int[M];
		dfs(1, 0);

	}

	public static void dfs(int start, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = start; i <= N; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);

		}
	}

}