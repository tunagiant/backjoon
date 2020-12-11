package chap11_BruteForce.n2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int result = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int str_len = str.length();
		int N = Integer.parseInt(str);

		for (int i = N - (9 * str_len); i < N; i++) {
			int number = i;
			int sum = 0;

			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}

			if (sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
