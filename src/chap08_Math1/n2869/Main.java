package chap08_Math1.n2869;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int A = 0, B = 0, V = 0;
		int dV = 0;
		int day = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		V = scanner.nextInt();
		
//		for (int i = 1; dV < V; i++) {
//			dV = A * i - B * (i - 1);
//			day = i;
//		}
		
		day = (V - B) / (A - B);		// A > B 이기 때문에
		
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		
		
		System.out.println(day);
		
	}

}
