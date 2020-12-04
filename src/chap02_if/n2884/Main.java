package chap02_if.n2884;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int H = 0;
		int M = 0;
		Scanner scanner = new Scanner(System.in);
		
		H = scanner.nextInt();
		M = scanner.nextInt();
		
		if (M < 45) {
			M += 15;
			if (H != 0) {
				H--;
			} else {
				H = 23;
			}
		} else {
			M -= 45;

		}
		
		System.out.println(H + " " + M);
	}

}
