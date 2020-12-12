package chap12_Sorting.n10989;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int[] arr = new int[10000001];
		
		for (int i = 0; i < N; i++) {
			int A = scanner.nextInt();
			arr[A]++;
		}
		
		for (int i = 0; i < 10000001; i++) {
			while (arr[i] > 0) {
				arr[i]--;
				System.out.println(i);
			}
		}
		
		
	}

}
