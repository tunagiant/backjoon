package chap12_Sorting.n2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		/* 배열이용 */
//		int N = scanner.nextInt();
//		int[] arr = new int[N];
//		
//		for (int i = 0; i < N; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		
//		for (int i = 0; i < N - 1; i++) {
//			int temp = 0;
//			for (int j = i + 1; j < N; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < N; i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		/* 함수이용 */
//		int N = scanner.nextInt();
//		int[] arr = new int[N];
//		
//		for (int i = 0; i < N; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		for (int i = 0; i < N; i++) {
//			System.out.println(arr[i]);
//		}

		/* 컬렉션이용 */
		int N = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}
		
		Collections.sort(list);
		for (int i = 0; i < N; i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
