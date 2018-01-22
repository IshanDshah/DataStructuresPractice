package stringarray;

public class BaseballNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ops = { "5", "2", "C", "D", "+" };

		int sum = 0;
		int tempValue = 0;
		int prevValue;
		for (int i = 0; i < ops.length; i++) {

			char c = ops[i].charAt(0);
			if ((int) (c) < 9 && (int) (c) > 0) {
				sum += (int) (c);
				tempValue = (int) (c);
			} else if (c == 'C') {
				sum = sum - tempValue;
				//tempValue=
			} else if (c == 'D') {
				
			} else if (c == '+') {

			}
		}
	}

}
