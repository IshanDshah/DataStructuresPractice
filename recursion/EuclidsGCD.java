package recursion;

public class EuclidsGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = findGCD(65536, 8975621);
		System.out.println(ans);
	}

	private static int findGCD(int a, int b) {
		// TODO Auto-generated method stub

		if (b == 0) {
			return a;
		}

		if (a > b) {
			return findGCD(b, a % b);
		} else {
			return findGCD(a, b % a);
		}
	}

}
