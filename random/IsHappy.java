package random;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIshanHappy(19));
	}

	// Leetcode loop
	public static boolean isHappy(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		int squareSum, remain;
		while (inLoop.add(n)) {
			squareSum = 0;
			while (n > 0) {
				remain = n % 10;
				squareSum += remain * remain;
				n /= 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;

		}
		return false;

	}

	// My try
	public static boolean isIshanHappy(int n) {
		Set<Integer> inLoop2 = new HashSet<Integer>();
		while (inLoop2.add(n)) {
			String s = String.valueOf(n);
			
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				sum += (Integer.parseInt("" +s.charAt(i))) * (Integer.parseInt(""+s.charAt(i)));
				

			}

			if (sum==1) {
				System.out.println(inLoop2.toString());
				return true;
			}else{
				n=sum;
			}
		}
		System.out.println(inLoop2.toString());
		return false;
	}

}
