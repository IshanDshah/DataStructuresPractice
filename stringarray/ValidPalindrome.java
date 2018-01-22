package stringarray;

//Ignore special characters and check
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("ishan");
	}
	
	//My method(Only better than 3.5% of submissions
	public static boolean isPalindrome(String s) {
        
        if(s==null||s.length()<2)
        {
            return true;
        }
        
        
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            StringBuilder sb=new StringBuilder();
        
        for(int i=s.length();i>0;i--)
        {
            sb.append(s.charAt(i-1));
        }
        String s1=sb.toString();
        return s.equals(s1);
    }

}
