package stringarray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candies = { 1, 1, 2, 2, 2, 2, 2, 5 };

		Set<Integer> kinds = new HashSet<>();
		for (int candy : candies)
			kinds.add(candy);

		System.out.println(kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size());

	}

}
