package geekforgeeks;

public class IntegerReplacement {

	public static void main(String[] args) {

		int n = 65535;
		if (n == Integer.MAX_VALUE)
			System.out.println(32); // n = 2^31-1;
		int count = 0;
		while (n > 1) {
			if (n % 2 == 0)
				n /= 2;
			else {
				if ((n + 1) % 4 == 0 && (n - 1 != 2))
					n++;
				else
					n--;
			}
			count++;
		}
		System.out.println(count);

	}

}
