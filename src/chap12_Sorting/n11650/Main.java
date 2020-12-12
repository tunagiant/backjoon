package chap12_Sorting.n11650;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < T; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			map.put(y, x);
		}

		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
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
