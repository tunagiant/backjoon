package chap11_BruteForce.n7568;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] rank = new int[N];
		for (int i = 0; i < N; i++)
			rank[i] = 1;
		
		List<Integer> tall = new ArrayList<Integer>();
		List<Integer> weight = new ArrayList<Integer>();
		
		while (tall.size() != N) {
			tall.add(scanner.nextInt());
			weight.add(scanner.nextInt());
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (tall.get(i) > tall.get(j) && weight.get(i) > weight.get(j)) {
					rank[j]++;
				} else if (tall.get(i) < tall.get(j) && weight.get(i) < weight.get(j)){
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}

	}

}
