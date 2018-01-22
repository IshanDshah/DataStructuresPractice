package stringarray;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args)
	{
		String[] strs={"geek","geeko","geeksforgeeks"};
		System.out.println(longestCommonPrefix(strs));
		
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		if (strs != null && strs.length > 0) {

			Arrays.sort(strs);

			char[] a = strs[0].toCharArray();
			char[] b = strs[strs.length - 1].toCharArray();

			for (int i = 0; i < a.length; i++) {
				if (b.length > i && a[i] == b[i]) {

					sb.append(a[i]);
				} else {
					return sb.toString();
				}

			}

		}
		return sb.toString();
	}
}
