package stringarray;

public class DetectCapitalise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Character.isUpperCase
		long a1 = System.nanoTime();
		Boolean ans = detectCapitalUse("IsHan");
		long a2 = System.nanoTime();
		Boolean ans2 = detectCapitalUsewithASCII("Ishan");
		long a3 = System.nanoTime();
		System.out.println(ans + "and" + ans2);

		System.out.println(a2 - a1);
		System.out.println(a3 - a2);

	}

	// This is a faster method as no use of Character.isUpperCase
	private static Boolean detectCapitalUsewithASCII(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		int z = (int) (str.charAt(0));
		for (int i = 0; i < str.length(); i++) {
			boolean b = false;
			int x = (int) (str.charAt(i));
			if (x >= 65 && x <= 90) {
				b = true;
			}
			if (b) {
				count++;
			}

		}

		if (count == str.length()) {
			return true;
		}

		if (count == 1 && (z >= 65) && z <= 90) {
			return true;
		}

		if (count == 0) {
			return true;
		}

		return false;

	}

	private static boolean detectCapitalUse(String word) {

		char[] arr = word.toCharArray();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			boolean b1;
			b1 = Character.isUpperCase(word.charAt(i));

			if (b1) {
				count++;
			}

		}

		if (count == word.length()) {
			return true;
		}

		if (count == 1 && (Character.isUpperCase(word.charAt(0)))) {
			return true;
		}

		if (count == 0) {
			return true;
		}

		return false;

	}
}
