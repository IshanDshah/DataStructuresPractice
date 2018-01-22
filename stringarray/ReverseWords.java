package stringarray;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "My name is Ishan";

		reverseWords(s1);
		reverseWordsNoExtraSpace(s1);
	}

	private static void reverseWordsNoExtraSpace(String s1) {
		// TODO Auto-generated method stub
		
	}

	public static void reverseWords(String s1) {

		StringBuilder str=new StringBuilder();
		String[] arr=s1.split(" ");
		for (int i = arr.length; i > 0; i--) {

			str.append(arr[i - 1]);
			str.append(" ");

		}
		System.out.println(str.toString());
	}
}
