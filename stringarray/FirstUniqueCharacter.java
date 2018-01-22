package stringarray;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		int ans = firstuniquecharacterID("ishanis");
		System.out.println(ans);
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		// another try
		long startTime2 = System.nanoTime();
		int ans2 = firstuniquecharacter("ishanis");
		System.out.println(ans2);
		long endTime2 = System.nanoTime();

		System.out.println(endTime2 - startTime2);
	}

	private static int firstuniquecharacter(String str) {

		Map<Character, Integer> hmap = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, 2);
			} else {
				hmap.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (hmap.get(str.charAt(i)) == 1) {
				return i;

			}
		}
		return -1;

	}

	public static int firstuniquecharacterID(String s) {

		Map<Character, Integer> hmap = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}

		}

		for (Entry<Character, Integer> en : hmap.entrySet()) {
			if (en.getValue() == 1) {
				return s.indexOf(en.getKey());
			}
		}
		return -1;
	}

}
