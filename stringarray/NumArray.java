package stringarray;

public class NumArray {
	int[] nums;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumArray arr1 = new NumArray(new int[] { 1, 2, 3, 4 });
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		int[][] ans = new int[arr2.length][arr2.length];

		long t1 = System.nanoTime();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				ans[i][j] = arr2[i] + arr2[j];
			}

		}

		System.out.println(ans[1][2]);
		System.out.println("matrix method " + (System.nanoTime() - t1));
		long t2 = System.nanoTime();
		System.out.println(arr1.sumRange(1, 2));
		System.out.println("original method " + (System.nanoTime() - t2));
	}

	public NumArray(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		this.nums = nums;
	}

	public int sumRange(int i, int j) {

		if (i == 0)
			return nums[j];

		return nums[j] - nums[i - 1];
	}

}
