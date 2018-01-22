package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ti = findSum(125470);
		System.out.println(ti);
	}

	private static int findSum(int i) {
		// TODO Auto-generated method stub
		if (i/10 == 0)
			return i;
		return (i % 10) + (findSum(i / 10));
	}

}
