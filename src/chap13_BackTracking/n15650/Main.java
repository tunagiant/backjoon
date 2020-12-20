package chap13_BackTracking.n15650;

import java.util.Scanner;

public class Main {
 
	public static int[] arr;
	public static boolean[] visit;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0, 0);
 
	}
 
	public static void dfs(int N, int M, int depth, int start) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = start; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1, i + 1);
				visit[i] = false;
			}
		}
	}
 
}