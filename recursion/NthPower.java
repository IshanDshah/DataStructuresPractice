package recursion;

public class NthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthPower obj = new NthPower();
		int ans = obj.power(2, 7);
		System.out.println(ans);

	}

	public int power(int num, int raise) {

		if (raise == 0)
			return 1;

		// System.out.println(num * power(num, raise - 1));
		return num * power(num, raise - 1);

	}

}
