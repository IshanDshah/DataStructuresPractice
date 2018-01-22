package stringarray;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans=hammingDistance(2,4);
	System.out.println(ans);
		   
		
	}
	 public static int hammingDistance(int x, int y) {
		 return Integer.bitCount(x ^ y);
	        
	        
	    }

}
