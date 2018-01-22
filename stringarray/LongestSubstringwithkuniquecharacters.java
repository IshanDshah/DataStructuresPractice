package stringarray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithkuniquecharacters {

	public static void main(String[] args) {
		int maxLen = 0;
		int k = 2; // # of distinct integers allowed
		int start = 0; // start index of this substring of interest
		Map<Character, Integer> map = new HashMap<>(); // map a char to its # of
														// appearance
		String s = "aabbaa";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				if (map.size() < k) {
					map.put(c, 1);
				} else {
					// need to delete a char from map; update start index along
					// the way
					while (true) {
						char startChar = s.charAt(start++);
						if (map.get(startChar) == 1) {
							map.remove(startChar);
							break;
						} else {
							map.put(startChar, map.get(startChar) - 1);
						}
					}
					map.put(c, 1);
				}
			}

			maxLen = Math.max(maxLen, i - start + 1);
		}

		System.out.println(maxLen);
	}
}
