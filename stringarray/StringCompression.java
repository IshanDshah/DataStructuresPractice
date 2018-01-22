package stringarray;

public class StringCompression {
	public static void main(String[] args) {

		String str = "aabbbcccc";
		char[] chr = str.toCharArray();

		int count = 0;
		for (int i = 0; i < chr.length; i++) {

			if (chr[i] == chr[i + 1]) {
				count++;
			} else {
				
			}
		}

	}
}
