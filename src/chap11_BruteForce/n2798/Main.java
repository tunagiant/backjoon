package chap11_BruteForce.n2798;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N = 0, M = 0;
		int NEAR = Integer.MAX_VALUE;
		int SUM = 0;
		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		M = scanner.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> Answer = new ArrayList<Integer>();

		while (list.size() != N)
			list.add(scanner.nextInt());

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				for (int k = j + 1; k < list.size(); k++) {
					SUM = list.get(i) + list.get(j) + list.get(k);
					if (Math.abs(SUM - M) <= NEAR) {
						NEAR = Math.abs(SUM - M);
						Answer.clear();
						Answer.add(list.get(i));
						Answer.add(list.get(j));
						Answer.add(list.get(k));
					}
				}
			}
		}

		System.out.println(Answer.get(0) + Answer.get(1) + Answer.get(2));

	}

}
