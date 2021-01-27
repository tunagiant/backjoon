package chap14_DP1.n1904;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] num = new String[(int) Math.pow(2, N)];
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = String.format("%0" + N + "d", Integer.parseInt((Integer.toBinaryString(i))));
		}
		
		for (int i = 0; i < num.length; i++) {
			while (num[i].contains("00")) {
				num[i] = num[i].replace("00", "xx");
			}
			if (num[i].contains("0")) {
				continue;
			}
			list.add(num[i]);
		}

		for (int i = 0; i < list.size(); i++) {
			list.get(i).replace("xx", "00");
			System.out.println(list.get(i));
		}
		
		
		System.out.println(list.size() % 15746);
	}

}
