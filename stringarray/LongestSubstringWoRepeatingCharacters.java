package stringarray;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWoRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ishanishpojikaz";
		int i = 0, j = 0, max = 0,x=0;
		Set<Character> set = new HashSet<>();

		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				System.out.println(set.toString());
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(i++));
				System.out.println("i    " +set.toString());
			}
		}
		System.out.println(max);

	}

}
