package chap14_DP1.n9461;

import java.util.Scanner;

public class Main {
	
	static boolean[] check = new boolean[101];
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int[] array = new int[T];
		
		for (int i = 0; i < T; i++) {
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(func(array[i]));
		}
	}

	private static int func(int N) {
		
		
		if (N <= 3) {
			return 1;
		} else if (N <= 5) {
			return 2;
		} else if (!check[N]) {
			return func(N - 1) + func(N - 5);
		} else {
			return func(N);
		}
		
		
		
		
	}

}
