package chap07_String.n11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int N = 0;
		int SUM = 0;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		str = br.readLine();
		char[] ch = str.toCharArray();
		
		for (int i = 0 ; i < N; i++) {
			SUM += ch[i] - '0';
		}
		
		System.out.println((int)SUM);
		
		
		
		
	}

}
