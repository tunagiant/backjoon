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
	static int MAX = 0;
	
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
		
		sol(0, 1);
		
	}

	private static void sol(int sum, int index) {
		
		if (index == 5) {
			MAX = Math.max(MAX, sum);
			return;
		}
		
		for (int i = 0; i < arr[index].size(); i++) {
			sol(sum + arr[index + 1].get(i), index++);
		}
		
		
	}

}
