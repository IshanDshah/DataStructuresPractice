package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = factorial(5);

		int sum = fibonacci(5);
		System.out.println(sum);
	}

	private static int fibonacci(int n) {

		if (n == 1)
			return 1;

		return n + fibonacci(n - 1);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub

		if (n == 1 || n == 0)
			return 1;

		return n * factorial(n - 1);
	}

}
