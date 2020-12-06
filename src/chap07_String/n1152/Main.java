package chap07_String.n1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		String str;
		String[] array;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine().trim();
//		array = str.split(" ");
//		if (!str.isEmpty())
//			System.out.println(array.length);
//		else
//			System.out.println(0);


		StringTokenizer st = new StringTokenizer(str, " ");
		
		if (!str.isEmpty())
			System.out.println(st.countTokens());
		else
			System.out.println(0);

	}
}
