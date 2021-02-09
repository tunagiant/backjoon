package chap14_DP1.n11053;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*testcase
6
10 20 10 30 20 50
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

	private static void sol(int index, int count) {

		for (int i = index; i < N - 1; i++) {
			for (int j = 1; j < N - i; j++) {
				if (arr[i + j] <= arr[i]) {
					continue;
				} else {
					sol(i + j, count + 1);
				}
			}
		}
		if (count > MAX) {
			MAX = count;
		}

	}

}
