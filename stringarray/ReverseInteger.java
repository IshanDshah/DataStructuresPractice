package stringarray;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseIntegerNaive(5123);
		reverseInteger(5123);
		
	}

	private static void reverseIntegerNaive(int ia) {
		// TODO Auto-generated method stub
		
		
		char[] s1=String.valueOf(ia).toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=s1.length;i>0;i--)
		{
			sb.append(s1[i-1]);
		}
		System.out.println(sb.toString());
	}

	private static void reverseInteger(int x) {
		// TODO Auto-generated method stub
		
		    int rev = 0;
		    while(x != 0){
		        rev = rev*10 + x%10;
		        x = x/10;
		    }
		 
		    System.out.println( rev);
		
		
		
		
	}

}
