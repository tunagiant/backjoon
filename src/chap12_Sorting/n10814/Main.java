package chap12_Sorting.n10814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		scanner.nextLine();

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < T; i++) {
			int age = scanner.nextInt();
			String name = scanner.nextLine();
			map.put(name, age);
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return o2.getKey().compareTo(o1.getKey());
				} else {
					return o1.getValue().compareTo(o2.getValue());

				}
			}

		});
		
		for (int i = 0; i < T; i++) {
			System.out.println(list.get(i).getValue() + " " + list.get(i).getKey());
		}
	}

}
