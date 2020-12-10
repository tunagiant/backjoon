package chap10_Recursive.n10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int N = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		System.out.print(dN(N));
		

	}

	private static int dN(int N) {

		if (N == 1)
			return 1;
		
		
		return N * dN(N - 1);
		
		

	}

}
