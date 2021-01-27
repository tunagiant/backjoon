import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*TestCase
17
5
B D I M P
11
3 -4 5 6 -7 -8 10 -12 -15 -20 23
*/

public class nhn01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// N:사람의수 A:빠른사람수
		int N = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int[] score = new int[N];

		// key:자리번호 value:이름
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			map.put(i, i);
		}

		// winner[]:달리기가 빠른사람
		boolean[] winner = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			winner[st.nextToken().charAt(0) - 65] = true;
		}

		// game:게임수 move[game]:해당 game 이동칸수
		int game = Integer.parseInt(br.readLine());
		int[] move = new int[game];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < game; i++) {
			move[i] = Integer.parseInt(st.nextToken());
		}

		// ----- solution

		int cur = 1;
		score[map.get(0)] = 1;

		for (int i = 0; i < game; i++) {
			// 이동칸수에 따른 현재 술래가 수건을 놓은 자리index : cur

			int init = cur;
			move[i] %= N - 1;
			cur = cur + move[i] + N - 1;
			if (cur >= N) {
				cur %= N - 1;
			}
			
			if (winner[map.get(cur)]) {
				score[map.get(0)]++;
				continue;
			}
			// key0번 : 술래
			int temp = map.get(cur);
			map.replace(cur, map.get(0));
			map.replace(0, temp);
			score[map.get(0)]++;
		}

		for (int i = 1; i < N; i++) {
			System.out.println((char) (map.get(i) + 65) + " " + score[map.get(i)]);
		}
		System.out.println((char) (map.get(0) + 65) + " " + score[map.get(0)]);

	}
}
