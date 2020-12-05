package chap07_String.n1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String str;
		int MAX = -1;
		char Answer = 0;
		boolean only = true;
		int[] count = new int[26];
		for (int i = 0; i < 26; i++)
			count[i] = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().toUpperCase();

		for (int i = 0; i < str.length(); i++)
			for (int j = 0; j < count.length; j++)
				if (str.charAt(i) == 'A' + j)
					count[j]++;

		for (int i = 0; i < 26; i++)
			if (count[i] > MAX) {
				MAX = count[i];
				Answer = (char) ('A' + i);
			}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] == MAX && only) {
				only = false;
			} else if (count[i] == MAX && !only) {
				Answer = '?';
			}
		}
		System.out.println(Answer);

	}

}
