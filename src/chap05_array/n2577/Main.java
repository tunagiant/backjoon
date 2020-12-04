package chap05_array.n2577;

import java.util.Scanner;

public class Main {

	static int[] array = new int[10];

	public static void main(String[] args) {

		int A = 0, B = 0, C = 0, result = 0;
		Scanner scanner = new Scanner(System.in);

		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		result = A * B * C;
		counting(result);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}

	}

	public static int[] counting(int result) {

		int n_result = result;

		while (result != 0) {
			n_result = result % 10;
			for (int i = 0; i < 10; i++) {
				if (n_result == i) {
					array[i]++;
					break;
				}
			}
			result /= 10;
		}

		return array;
	}

}
