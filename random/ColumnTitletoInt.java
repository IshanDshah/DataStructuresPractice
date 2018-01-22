package random;


public class ColumnTitletoInt {

	// TODO Auto-generated method stub
	public static void main(String[] args) {

		int result = 0;
		String s = "AZ";
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
			System.out.println(s.charAt(i) - 'A');
		}
		System.out.println(result);
		
		
	}
}
