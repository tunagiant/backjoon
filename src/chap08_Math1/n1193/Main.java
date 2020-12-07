package chap08_Math1.n1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int X = 0;
		int N = 0; // N ºÐÀÚ
		int sum = 2;
		int range = 1;

		Scanner scanner = new Scanner(System.in);

		X = scanner.nextInt();

		if (X == 1) {
			System.out.println("1/1");
		} else {
			while (range < X) {
				range = range + sum;
				sum++;
			}
			if (sum % 2 == 0) {
				N = range - X + 1;
				System.out.println(N + "/" + (sum - N));
			} else {
				N = sum - (range - X + 1);
				System.out.println(N + "/" + (sum - N));
			}

		}

	}

}
