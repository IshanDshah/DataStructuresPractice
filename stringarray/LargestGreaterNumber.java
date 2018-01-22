package stringarray;

public class LargestGreaterNumber {
	// 747. Largest Number Greater Than Twice of Others

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 7, 3 };
		int max = Integer.MIN_VALUE;
		int k = 0;
		// Get the largest num
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				k = i;
			}
		}
		// System.out.println(max);
		int count = 1;
		for (int j : arr) {
			if (j != max) {
				if (max >= (2 * j)) {
					count++;
				}
			}
		}

		if (count == arr.length) {
			System.out.println("" + k);
		}
	}

}
