package chap14_DP1.n2156;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*testcase
6
6
10
13
9
8
1
 */

public class Main {
	static int N = 0;
	static int[] arr;
	static int MAX = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		sol(0, 0, 0);

		bw.write(String.valueOf(MAX));
		bw.flush();
		bw.close();
		br.close();

	}

	private static void sol(int index, int count, int sum) {
	
		for (int i = index; i < N - 1; i++) {
			if (count != 2) {
				sol(i + 1, count + 1, sum + arr[i]);
			} else {
				if (i < N - 2) {
					sol(i + 1, 0, sum);
				}
			}
		}

		MAX = Math.max(sum, MAX);

	}

}
