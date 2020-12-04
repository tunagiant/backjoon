package chap05_array.n10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		int N = 0;
		int MIN = Integer.MAX_VALUE;
		int MAX = Integer.MIN_VALUE;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		String[] arr_s = new String[N];
		int[] arr = new int[N];
		
		s = br.readLine();
		arr_s = s.split(" ");
		for (int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(arr_s[i]);
		}

		for (int i = 0 ; i < N; i++) {
			if (arr[i] >= MAX) {
				MAX = arr[i];
			}
			if (arr[i] <= MIN) {
				MIN = arr[i];
			}
		}
		
		System.out.println(MIN + " " + MAX);
		
		
	}

}
