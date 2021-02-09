package chap14_DP1.n11054;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*testcase
10
1 5 2 1 4 3 4 5 2 1
 */

public class Main {
	static int N = 0;
	static int[] arr;
	static int MAX = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		sol(0, 1);
		
		bw.write(String.valueOf(MAX));
		bw.flush();
		bw.close();
		br.close();

	}
	


	private static void sol(int pivot, int count) {
		
		for (int i = 0; i < N; i++) {
			sol1(pivot, count);
			sol2(pivot, count);
		}
		
		if (count > MAX) {
			MAX = count;
		}
		
	}



	private static void sol1(int index, int count) {

		for (int i = index; i < N - 1; i++) {
			for (int j = 1; j < N - i; j++) {
				if (arr[i + j] <= arr[i]) {
					continue;
				} else {
					sol1(i + j, count + 1);
				}
			}
		}

	}
	

	private static void sol2(int index, int count) {

		for (int i = N - 1 - index; i > index; i--) {
			for (int j = 1; j < N - i; j++) {
				if (arr[i - j] <= arr[i]) {
					continue;
				} else {
					sol2(i - j, count + 1);
				}
			}
		}

	}
	

}
