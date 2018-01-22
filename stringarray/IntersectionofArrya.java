package stringarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofArrya {

	// Faster way to do this is add all the numbers of one array in a set and
	// than compare the two arrays
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 4, 5, 2, 1 };
		int[] arr2 = { 1, 2, 1, 1, 13, 4, 5, 6 };

		fasterMethod(arr1, arr2);

		Set<Integer> ans = new HashSet<>();

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					ans.add(arr1[j]);
				}

			}

		}
		int[] arr = new int[ans.size()];
		int j = 0;
		for (int i : ans) {

			arr[j++] = i;

		}

		System.out.println(Arrays.toString(arr));

	}

	private static void fasterMethod(int[] arr1, int[] arr2) {

		Set<Integer> ar1 = new HashSet<>();
		Set<Integer> intersectedSet = new HashSet<>();

		for (int i : arr2) {
			ar1.add(i);
		}

		for (int i : arr1) {
			if (ar1.contains(i)) {
				intersectedSet.add(i);
			}
		}

		System.out.println(intersectedSet);

	}

}
