package chap11_BruteForce.n1436;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10000; i++) {
			if (String.valueOf(i).contains("666")) {
				list.add(i);
			}
			
		}
		
		System.out.println(list.get(N - 1));
	}

}
