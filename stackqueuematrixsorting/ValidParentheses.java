package stackqueuematrixsorting;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Character> hs = new HashMap<>();
		hs.put('(', ')');
		hs.put('{', '}');
		hs.put('[', ']');

		String check = "{[]}()";

		Stack<Character> sc = new Stack<>();
		boolean asn = false;
		for (int i = 0; i < check.length(); i++) {
			char c = check.charAt(i);

			if (hs.keySet().contains(c)) {
				sc.push(c);
			} else if (hs.values().contains(c)) {
				System.out.println(sc.peek());
				if (!sc.isEmpty() && hs.get(sc.peek()) == c) {
					sc.pop();
				} else {
					asn = false;
					break;
				}

			}
		}
		asn = sc.isEmpty();
		System.out.println(asn + "" + sc.size());
	}

}
