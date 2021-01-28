import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Testcase
2
6
6 2 11 0 3 5
6 3 0 9 0 5

3
10
6 12 0 2 8 4 0 7 3 6
6 1 3 0 2 8 0 0 13 8
6 3 0 10 6 5 7 0 0 3

 */

public class nhn02 {
	private static int[][] arr;
	private static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		count = 0;

		int day = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());
		arr = new int[day][width];

		for (int i = 0; i < day; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < width; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}

		}
		
		for (int i = 0; i < day; i++) {
			int start = 0;
			int end = 0;
			for (int j = 1; j < width; j++) {
				if (arr[i][j - 1] > arr[i][j]) {
					start = j - 1;
					for (int k = j + 1; k < width; k++) {
						if (arr[i][k] > arr[i][j]) {
							end = k;
							while (arr[i][start] > arr[i][j] && j > 0 && start > 0) {
								j--;
								start--;
							}
							fun(i, start, end);
							j = k;
							break;
						}
					}
				}
			}
			
		}
		

		System.out.println(count);

	}
	
	private static void fun(int day, int start, int end) {
		
		int MAX = Math.min(arr[day][start], arr[day][end]);
		for (int i = start + 1; i < end; i++) {
			while (arr[day][i] < MAX) {
				arr[day][i]++;
				count++;
			}
		}
		
//		if (arr[day][end + 1] > MAX) {
//			fun(day, start, end);
//		}
		
	}
	
	
	

}
