package chap14_DP1.n2579;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* testcase
6
10
20
15
25
10
20
 */

public class Main {
	static int N = 0;
	static int[] arr;
	static int RESULT = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		sol(0, 0, 10);
		bw.write(String.valueOf(RESULT));
		bw.flush();
		bw.close();
		br.close();

	}

	private static void sol(int idx, int count, int sum) {

		// i : 뛰어넘는 계단 수(1칸, 2칸)
		for (int i = 1; i <= 2; i++) {
			// count : 연속된 계단 오른 수
			if (count == 2) {
				return;
			} else {
				if (idx + i < N) {
					sum += arr[idx + i];
					switch (i) {
					case 1:
						sol(idx + i, count + 1, sum);
						break;
					case 2:
						sol(idx + i, 0, sum);
						break;
					}
					sum -= arr[idx + i];

				}

			}
		}
		if (idx == N - 1) {
			RESULT = Math.max(sum, RESULT);
		}

	}

}
