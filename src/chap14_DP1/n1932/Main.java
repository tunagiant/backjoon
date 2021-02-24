package chap14_DP1.n1932;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
/*TestCase
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
 */

public class Main {

	static int N = 0;
	static ArrayList<Integer>[] arr;
	static int RESULT = 0;
	static boolean[] check;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			arr[i] = new ArrayList<Integer>();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				arr[i].add(Integer.parseInt(st.nextToken()));
			}
		}

		sol(0, arr[0].get(0), 0);

		bw.write(String.valueOf(RESULT));
		bw.flush();
		bw.close();
		br.close();

	}

	private static void sol(int index, int sum, int depth) {

		if (depth == 4) {
			RESULT = Math.max(RESULT, sum);
			return;
		}

		for (int i = 0; i < 2; i++) {
			sol(index + i, sum + arr[depth + 1].get(index + i), depth + 1);
			

		}

	}

}
