import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean ans = PerfectNumbersCheck(28);
		
			System.out.println(ans);
	}

	private static Boolean PerfectNumbersCheck(int j) {
		// TODO Auto-generated method stub
		  int sum=0;
			for(int i=1;i<=j/2;i++)
			{
				
				if(j%i==0)
				{
					sum+=i;
				}
			}
			
			return sum==j?true:false;
	}
}
