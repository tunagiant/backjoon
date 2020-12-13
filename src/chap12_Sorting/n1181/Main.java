package chap12_Sorting.n1181;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		int T = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		T = scanner.nextInt();
		
		String[] str = new String[T];
		
		scanner.nextLine();
		
		for (int i = 0; i < T; i++) {
			str[i] = scanner.nextLine();
		}
		
		Set<String> set = new HashSet<String>(Arrays.asList(str));
		List<String> list = new ArrayList<String>(set);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()){
					return -1;
				} else {
					return o1.compareTo(o2);
				}
			}
			
		});
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
