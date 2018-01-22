package stringarray;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrr1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maximumSubArray(arrr1);
	}

	private static void maximumSubArray(int[] arr) {
		// TODO Auto-generated method stub

		if (arr == null || arr.length == 0) {
			System.out.println("Empty array");
		} else if (arr.length == 1) {
			System.out.println(arr[0]);
		}
		int maxSum = arr[0];
		int newSum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			newSum = Math.max(newSum + arr[i], arr[i]);
			maxSum = Math.max(maxSum, newSum);

		}
		System.out.println(maxSum);
	}

}
