package chap08_Math2.n4153;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A = -1, B = -1, C = -1;
		List<Integer> list = new ArrayList<Integer>();
		List<String> answer = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		while (A != 0 && B != 0 && C != 0) {

			A = scanner.nextInt();
			B = scanner.nextInt();
			C = scanner.nextInt();

			if (A == 0 && B == 0 && C == 0)
				break;

			list.add(A);
			list.add(B);
			list.add(C);
			Collections.sort(list);

			if (Math.pow(list.get(2), 2) == Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2))
				answer.add("right");
			else
				answer.add("wrong");

			list.clear();

		}

		for (int i = 0; i < answer.size(); i++)

			System.out.println(answer.get(i));

	}

}
