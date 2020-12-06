package chap07_String.n2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String str;
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();
//c= c- dz= d- lj nj s= z=
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c') {
				switch (str.charAt(i + 1)) {
				case '=':
					i++;
					count++;
					continue;
				case '-':
					i++;
					count++;
					continue;
				}
			}

			if (str.charAt(i) == 'd') {
				switch (str.charAt(i + 1)) {
				case '-':
					i++;
					count++;
					continue;
				case 'z':
					if (str.charAt(i + 2) == '=') {
						i += 2;
						count++;
						continue;
					}
				}
			}

			if ((str.charAt(i) == 'l' || str.charAt(i) == 'n') && str.charAt(i + 1) == 'j') {
				i++;
				count++;
				continue;
			}

			if ((str.charAt(i) == 's' || str.charAt(i) == 'z') && str.charAt(i + 1) == '=') {
				i++;
				count++;
				continue;
			}
			
			count++;

		}

		System.out.println(count);

	}

}
