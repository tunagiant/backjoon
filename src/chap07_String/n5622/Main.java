package chap07_String.n5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String str;
		int result = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A', 'B', 'C':
				result += 3;
				break;
			case 'D', 'E', 'F':
				result += 4;
				break;
			case 'G', 'H', 'I':
				result += 5;
				break;
			case 'J', 'K', 'L':
				result += 6;
				break;
			case 'M', 'N', 'O':
				result += 7;
				break;
			case 'P', 'Q', 'R', 'S':
				result += 8;
				break;
			case 'T', 'U', 'V':
				result += 9;
				break;
			case 'W', 'X', 'Y', 'Z':
				result += 10;
				break;
			}

		}
		System.out.println(result);

	}

}
