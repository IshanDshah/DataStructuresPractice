package recursion;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertBase(15, 2);
		// System.out.println(ans);
	}

	private static void convertBase(int i, int base) {
		// TODO Auto-generated method stub

		if (i == 0)
			return;

		convertBase(i/base, base);
		int remainder=i % base;
		if(remainder<10){
			System.out.println(remainder);
		}else
		{
			System.out.println((char)(remainder - 10 + 'A'));
		}
		
	}

}
