package chap12_Sorting.n2108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double AVG = 0;
		int CENTER = 0;
		int FREQ = Integer.MIN_VALUE;
		int RANGE = 0;

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		Integer[] arr = new Integer[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
			AVG += arr[i];
		}
		// Æò±Õ
		AVG = Math.round((AVG / N));

		// Áß¾Ó°ª
		List<Integer> center = new ArrayList<Integer>();
		center = Arrays.asList(arr);
		Collections.sort(center);
		CENTER = center.get(N / 2);
		RANGE = center.get(N - 1) - center.get(0);

		// ÃÖºó°ª
		List<Integer> freqList = new ArrayList<Integer>();
		int[] freq = new int[8001];

		for (int i = 0; i < N; i++) {
			if (arr[i] < 0) {
				freq[arr[i] * (-1) + 4000]++;
			} else {
				freq[arr[i]]++;
			}

		}
		
		for (int i = 0; i < 8001; i++) {
			if (freq[i] != 0 && freq[i] > FREQ) {
				FREQ = freq[i];
			}
		}

		for (int i = 0; i < 8001; i++) {
			if (freq[i] == FREQ) {
				if (i > 4000) {
					freqList.add((i - 4000) * (-1));
				} else {
					freqList.add(i);
				}

			}
		}

		Collections.sort(freqList);
		if (freqList.size() == 1) {
			FREQ = freqList.get(0);
		} else {
			FREQ = freqList.get(1);
		}

		System.out.println((int) AVG);
		System.out.println(CENTER);
		System.out.println(FREQ);
		System.out.println(RANGE);

	}
}
