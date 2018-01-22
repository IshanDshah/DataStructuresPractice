package stringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };

		String s1 = "qwertyuiop";
		String s2 = "asdfghjkl";
		String s3 = "zxcvbnm";
		List<String> ans = new ArrayList<>();

		for (String s : words) {
			int c1 = 0, c2 = 0, c3 = 0;
			char[] arr = s.toLowerCase().toCharArray();
			for (Character c : arr) {
				if (s1.indexOf(c) != -1) {
					c1++;
				} else if (s2.indexOf(c) != -1) {
					c2++;
				} else if (s3.indexOf(c) != -1) {
					c3++;
				}
			}

			if (c1 == s.length() || c2 == s.length() || c3 == s.length()) {
				ans.add(s);

			}
		}

		String[] stockArr = new String[ans.size()];
		stockArr = ans.toArray(stockArr);

		// return stockArr;
	}

}
