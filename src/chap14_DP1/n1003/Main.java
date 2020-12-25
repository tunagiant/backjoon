package chap14_DP1.n1003;

import java.util.Scanner;

public class Main {
	
	static int[] num;
	static Integer[][] dp = new Integer[41][2];
	static int T;

	
	public static void main(String[] args) {

		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		num = new int[T];
		
		for (int i = 0; i < T; i++) {
			num[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < T; i++) {
			fibonacci(num[i]);
			System.out.println(dp[num[i]][0] + " " + dp[num[i]][1]);
		}
		
		
	}
	
	static Integer[] fibonacci(int N) {
		
		if (dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		
		return dp[N];
	}
	

}
