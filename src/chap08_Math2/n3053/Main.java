package chap08_Math2.n3053;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int N = 0;
		float Default = 0;
		float Taxi = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		
		Default = (float) (Math.PI * N * N);
		Taxi = 2 * N * N;
		
		System.out.printf("%.6f\n", Default);
		System.out.printf("%.6f", Taxi);
		
		
		
	}

}
