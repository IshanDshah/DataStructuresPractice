package stringarray;

import java.util.Arrays;

public class FindMaxConsecutiveones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 1 };

		if (arr.length == 1 && arr[0] == 1) {
			System.out.println(1);
		}

		if (arr.length == 1 && arr[0] == 0) {
			System.out.println(0);
		}
		int count = 0;
		int max = Integer.MIN_VALUE;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}

			if (i == arr.length - 1) {
				if ((count > max)) {
					max = count;
				}
			}
		}
		System.out.println((max));

	}

}
