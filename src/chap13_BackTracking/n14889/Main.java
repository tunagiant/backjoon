package chap13_BackTracking.n14889;

import java.util.Scanner;

public class Main {

	static int[][] arr;
	static boolean[] check;
	static int N;
	static int MIN = 100;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();

		arr = new int[N][N];
		check = new boolean[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		dfs(0, 0);
		System.out.println(MIN);

	}

	private static void dfs(int index, int count) {

		if (count == N / 2) {
			diff();
			return;
		}
		
		for (int i = index; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				dfs(i + 1, count + 1);
				check[i] = false;
			}
		}

	}

	private static void diff() {
		int START = 0;
		int LINK = 0;
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (check[i] == true && check[j] == true) {
					START += arr[i][j];
					START += arr[j][i];
				} else if (check[i] == false && check[j] == false) {
					LINK += arr[i][j];
					LINK += arr[j][i];
				}
			}
		}
		
		int val = Math.abs(START - LINK);
		
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		MIN = Math.min(val, MIN);
		
	}

}
