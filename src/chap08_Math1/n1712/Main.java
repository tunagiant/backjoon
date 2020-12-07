package chap08_Math1.n1712;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A = 0, B = 0, C = 0;
		int N = 0;

		Scanner scanner = new Scanner(System.in);

		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		if (C <= B)
			System.out.println(-1);
		else
			System.out.println((A / (C - B)) + 1);

	}

}
