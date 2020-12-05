package chap07_String.n2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = 0;

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		String[] array = new String[N];

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int M = scanner.nextInt();
			String str = scanner.nextLine().trim();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < M; k++) {
					sb.append(str.charAt(j)); 
				}
			}
			array[i] = sb.toString();
			sb.delete(0, sb.length());

		}
		for (int i = 0; i < N; i++) {
			System.out.println(array[i]);

		}

	}
}
