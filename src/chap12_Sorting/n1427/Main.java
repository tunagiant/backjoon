package chap12_Sorting.n1427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		String str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			list.add((int)(str.charAt(i) - '0'));
		}
		
		Collections.sort(list);
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}

}
