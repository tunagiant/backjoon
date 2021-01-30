import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*TestCase
2(AB)
R(GB)
3G
2(BR2(G))1(B2(B(R)))

2
B2(RG)
3(R2(GB))
 */

public class nhn03 {
	static String[] arr;
	static int open;
	static HashMap<Integer, Character>[] map;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
			Stack<Integer> stack = new Stack();
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == '(') {
					stack.push(j);
				}
			}
			sol(arr[i], i, stack);
		}
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

//ASKII		1:49	9:57
	private static String sol(String str, int a, Stack stack) {
		int count = 0;
		StringBuilder sb = new StringBuilder();

		if (str.contains("(")) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(') {
					count++;
					stack.push(i);
				} else if (str.charAt(i) == ')') {
					count--;
					if (count == 0) {
						break;
					} else {
						
					}
					int start = stack.pop() + 1;
					int end = i;
					String unit = str.substring(start, end);
					sol(unit, a);
					String newunit;

					if (str.charAt(start - 1) >= 49 && str.charAt(start - 1) <= 57) {
						int num = str.charAt(start - 1) - '0';
						for (int j = 0; j < num; j++) {
							sb.append(unit);
						}
						newunit = sb.toString();
					} else {
						for (int j = 0; j < unit.length(); j++) {
							sb.append(str.charAt(start - 1)).append(unit.charAt(j));
						}
						newunit = sb.toString();
					}

					str.replace(unit, newunit);
				}
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 49 && str.charAt(i) <= 57) {
					int num = str.charAt(i) - '0';
					for (int j = 1; j < num; j++) {
						sb.append(str.charAt(i + 1));
					}
					str.replace(String.valueOf(str.charAt(i)), sb.toString());
				}
			}

		}
		return str;

	}

}

//int n = arr[a].length();
//String[] unit = new String[count[a]];
//open = 0;
//int c = 0;
//Stack<Integer> stack = new Stack();
//int end = 0;
//
//for (Map.Entry<Integer, Character> m : map[a].entrySet()) {
//	if (m.getValue() == '(') {
//		open++;
//		stack.push(m.getKey());
//		continue;
//	} else if (m.getValue() == ')' && open > 0) {
//		open--;
//		end = m.getKey();
//		unit[c++] = arr[a].substring(stack.pop() + 1, end);
//	}
//	
//}
//
