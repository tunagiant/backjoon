package chap08_Math1.n2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = 0;
		int dN = 0;
		int S3 = 0, S5 = 0;
		int result = 0;

		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		dN = N;

		while (dN > 0) {
			if (dN == 1 || dN == 2) {
				result = -1;
				break;
			} else if (dN % 5 != 0) {
				dN -= 3;
				S3++;
			} else {
				dN -= 5;
				S5++;
			}
			result = S3 + S5;

		}

		System.out.println(result);

	}

}
