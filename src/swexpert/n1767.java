package swexpert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1767 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] answer = new int[T];

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
				answer[i] = fun(arr);
			}
		}
		
		for (int i = 0; i < T; i++) {
			bw.write("#" + i + " " + answer[i]);
			
		}

		bw.flush();
		br.close();
		bw.close();

	}
	
	private static int fun(int[][] arr) {
		
		
		
		
		return 0;
	}

}
