package stringarray;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans=reverseWords("Hi My name's is Ishan");
		System.out.println(ans);
	}

	private static String reverseWords(String str) {
		// TODO Auto-generated method stub
		String[] st = str.split("\\s+");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < st.length; i++) {
			if (i + 1 == st.length) {
				sb.append(reverse(st[i]));
			} else {
				sb.append(reverse(st[i]) + " ");
			}
		}

		return sb.toString();
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub

		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);

		}

		return sb.toString();
	}

}
