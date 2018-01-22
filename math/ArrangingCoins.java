package math;

public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrangeCoins(3);
	}

	public static void arrangeCoins(int num) {

		int c = num;
		int count = 0;

		if (num == 1) {

			System.out.println(1);
			;
		}
		for (int i = 1; i <= c; i++) {
			if (i <= c) {
				c -= i;
				count++;
			}

		}
		System.out.println(count);

	}

}
