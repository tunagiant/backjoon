package chap14_DP1.n9461;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	
	static boolean[] check = new boolean[101];
	static int[] array = new int[101];
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] num = new int[T + 1];

		for (int i = 1; i <= T; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= T; i++) {
			sb.append(String.valueOf(func(num[i])));
			bw.write(sb.toString() + '\n');
			sb.delete(0, sb.length());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static int func(int N) {
		
		
		if (N <= 3) {
			return array[N] = 1;
		} else if (N <= 5) {
			return array[N] = 2;
		} else if (!check[N]) {
			return array[N] = func(N - 1) + func(N - 5);
		} else {
			return array[N];
		}
		
		
		
		
	}

}
