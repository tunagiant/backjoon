package chap06_Function.n4673;

public class Main {

	static boolean[] count = new boolean[10001];

	public static void main(String[] args) {
		
		for (int i = 1; i < 10001; i++) {
			int dn = getDn(i);
			if (dn <= 10000) {
				count[dn] = true;
			}
		}
		
		for (int i = 1; i < count.length; i++) {
			if (!count[i]) {
				System.out.println(i);
			}
		}
		
	}
	
	private static int getDn(int n) {
		int dn = n;
		while (n > 0) {
			dn += n % 10;
			n /= 10;
		}
		return dn;
	}

}
