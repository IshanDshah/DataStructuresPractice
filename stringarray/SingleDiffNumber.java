package stringarray;

public class SingleDiffNumber {
	// Given an array of integers, every element appears twice except for one.
	// Find that single one.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = 0;

		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };

		int len = nums.length;
		for (int i = 0; i != len; i++) {
			System.out.println(ans ^ nums[i]);
			ans ^= nums[i];
		}
		System.out.println(ans);

	}

}
