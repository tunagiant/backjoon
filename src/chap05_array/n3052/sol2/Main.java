package chap05_array.n3052.sol2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[10];
		Set<Integer> set = new TreeSet<Integer>();
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
		}

		
		set.addAll(Arrays.asList(array));
		
		
		System.out.println(set.size());

		
	}

}
