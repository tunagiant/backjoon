package chap08_Math2.n2581;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int M = 0, N = 0;
		int length = 0;
		int Min = Integer.MAX_VALUE;
		int SUM = 0;
		boolean isOnly = true;

		List<Integer> list = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		M = scanner.nextInt();
		N = scanner.nextInt();

		for (int i = M; i <= N; i++) {
			isOnly = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isOnly = false;
					break;
				}

			}
			if (isOnly && i != 1) {
				isOnly = false;
				list.add(i);
			}
		}

		for (int i = 0; i < list.size(); i++) 
			SUM += list.get(i);
		
		if (list.size() != 0) {
			System.out.println(SUM);
			System.out.println(list.get(0));
			
		} else {
			System.out.println(-1);
		}

	}

}
