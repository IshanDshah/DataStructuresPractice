package stringarray;

import java.util.Arrays;

public class productExceptSelf {

	// Solved but time limit exceeded on Leetcode
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrs = { 1, 2, 3, 4 };
		int[] ans = new int[arrs.length];

		for (int i = 0; i < arrs.length; i++) {
			int j = 0;
			int mul = 1;
			while (j >= 0 && j < arrs.length) {
				
				if (i != j) {
					mul = mul * arrs[j];
					
					j++;
				}
				else
				{
					j++;
				}
			}
			ans[i]=mul;

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
