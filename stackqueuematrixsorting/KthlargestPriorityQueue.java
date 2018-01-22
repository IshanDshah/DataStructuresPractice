package stackqueuematrixsorting;

import java.util.PriorityQueue;

public class KthlargestPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 3, 4, 5, 2, 5, 6 };
		int k =2 ;

		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < nums.length; i++) {
			q.add(nums[i]);
		}

		while (q.size() > k) {
			q.poll();
		}
		System.out.println(q.peek());
	}

}
