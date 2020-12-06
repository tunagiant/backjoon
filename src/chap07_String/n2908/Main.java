package chap07_String.n2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String str;
		String[] input;
		String[] result;
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		input = str.split(" ");
		result = str.split(" ");
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length(); j++) {
				sb.append(input[i].charAt(input[i].length() - 1 - j));
			}
			result[i] = sb.toString();
			sb.delete(0, sb.length());
		}
		
		if (Integer.parseInt(result[0]) > Integer.parseInt(result[1]))
			System.out.println(result[0]);
		else
			System.out.println(result[1]);
		
		
		
		
	}

}
