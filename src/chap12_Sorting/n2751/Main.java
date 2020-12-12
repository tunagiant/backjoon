package chap12_Sorting.n2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}
		
		StringBuilder sb = new StringBuilder();
		
		Collections.sort(list);
		
		for (int i : list) {
			sb.append(i).append("\n");
		}
		System.out.print(sb);
		
	}

}
