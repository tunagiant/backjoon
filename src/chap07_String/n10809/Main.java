package chap07_String.n10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String str;
		int[] counting = new int[26];
		for (int i = 0; i < 26; i++) {
			counting[i] = -1;
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();

		for (int i = 0; i < str.length(); i++)
			for (int j = 0; j < 26; j++)
				if (str.charAt(i) == 'a' + j)
					if (counting[j] == -1)
						counting[j] = i;

		for (int i = 0; i < counting.length; i++) {
			System.out.print(counting[i] + " ");
		}

	}

}
