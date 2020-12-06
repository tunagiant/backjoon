package chap07_String.n1316;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = 0;
		int count = 0;

		N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}

		System.out.println(count);

	}

	private static boolean check() {

		boolean[] check = new boolean[26];
		String str = scanner.next();
		int prev = 0;

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;

				} else {
					return false;
				}
			}

		}
		return true;

	}

}
