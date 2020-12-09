package chap08_Math2.n3009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
		int y1 = 0, y2 = 0, y3 = 0, y4 = 0;

		Scanner scanner = new Scanner(System.in);

		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		x3 = scanner.nextInt();
		y3 = scanner.nextInt();

		if (x1 == x2)
			x4 = x3;
		else if (x2 == x3)
			x4 = x1;
		else
			x4 = x2;
		
		if (y1 == y2)
			y4 = y3;
		else if (y2 == y3)
			y4 = y1;
		else
			y4 = y2;
		
		System.out.println(x4 + " " + y4);

	}

}
