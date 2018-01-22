package stringarray;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 6, 4, 7, 2, 5, 3, 9 };

		sortDoubeLoop(arr);
		sortBinary(arr);
	}

	private static void sortBinary(int[] arr) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	private static void sortDoubeLoop(int[] arr) {
		// TODO Auto-generated method stub
		// O(n2) time
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
	}

}
