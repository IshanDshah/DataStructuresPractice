package math;

public class CountPrimes {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long bef = System.nanoTime();
		// System.out.println(countPrimes(499979));
		System.out.println(countPrimeswithsqrt(8));

		// System.out.println(System.nanoTime() - bef);
	}

	private static int countPrimeswithsqrt(int n) {

		// TODO Auto-generated method stub
		for (int i = 1; i < n; i++) {
			boolean ans = checkPrimewithsqrt(i);
			if (ans) {
				count++;
			}
		}

		return count;
	}
	// Finally, we know 2 is the "oddest" prime -
	// it happens to be the only even prime number. Because of this,
	// we need only check 2 separately, then traverse odd numbers up to the
	// square root of n.

	private static boolean checkPrimewithsqrt(int n) {

		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	private static int countPrimes(int n) {

		if (n < 3)
			return 0;
		for (int i = 2; i < n; i++) {
			boolean ans = checkPrime(i);
			if (ans) {
				count++;
			}
		}

		return count;
	}

	private static boolean checkPrime(int i) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

}
