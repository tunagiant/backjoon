package chap08_Math2.n1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int X = 0, Y = 0;
		int W = 0, H = 0;
		int disX = 0, disY = 0;
		int answer = 0;

		Scanner scanner = new Scanner(System.in);
		X = scanner.nextInt();
		Y = scanner.nextInt();
		W = scanner.nextInt();
		H = scanner.nextInt();

		if (X <= (W / 2))
			disX = X;
		else
			disX = W - X;

		if (Y <= (H / 2))
			disY = Y;
		else
			disY = H - Y;

		if (disX >= disY)
			answer = disY;
		else
			answer = disX;
		
		System.out.println(answer);

	}

}
