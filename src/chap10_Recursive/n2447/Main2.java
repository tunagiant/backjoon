package chap10_Recursive.n2447;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	static char[][] arr;
	static int N;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		arr = new char[N][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(arr[i], ' ');
		}

	}

	private static void fun(int x, int y, int size) {

	}

}
