package stringarray;

public class BestTimetoBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { -2, 1, -6, 7, -1, 2, 1, -5, 4 };
		// time limit exceeded
		BestTimetoBuy(arr1);

		// try Better approach
		bestTime(arr1);
	}

	private static void BestTimetoBuy(int[] arr1) {
		// TODO Auto-generated method stub
		int profit = Integer.MIN_VALUE;
		int maxprofit = Integer.MIN_VALUE;
		int i2 = 0, j2 = 0;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = i; j < arr1.length; j++) {

				profit = arr1[j] - arr1[i];
				if (profit > maxprofit) {
					maxprofit = profit;
					i2 = i;
					j2 = j;
				}

			}

		}
		System.out.println(maxprofit + " " + i2 + " " + j2);

	}

	private static void bestTime(int[] arr1) {
		int maxProfit = 0;
		if (arr1 != null && arr1.length!=0) {

			int max = arr1[0];
			for (int i = 0; i < arr1.length; i++) {

				if (arr1[i] > max) {
					maxProfit = Math.max(maxProfit, arr1[i] - max);
				} else {
					max = arr1[i];
				}

			}
			System.out.println(maxProfit);
		}

	}

}
