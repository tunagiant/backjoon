package chap05_array.n3052.sol1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[10];
		int[] result = new int[10];
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
			result[i] = array[i] % 42;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (result[i] == result[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(10 - count);

	}

}
