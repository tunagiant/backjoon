package chap14_DP1.n2748;

import java.util.Scanner;

public class Main {
	
	static long[] arr;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		arr = new long[N + 1];
		for (int i = 0; i < N + 1; i++) {
			arr[i] = -1;
		}
		
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(func(N));
	}

	private static long func(int N) {
				
		if (arr[N] == -1) {
			arr[N] = func(N - 1) + func(N - 2);
		}
		
		return arr[N];
		
		
		
	}

}
