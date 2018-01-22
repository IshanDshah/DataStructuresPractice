package stringarray;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,5,6,7,8,9,10};
		System.out.println(missingNumber(arr));
	}

	private static int missingNumber(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] ans=new int[2];
		
		int len=arr.length;
		int expectedsume=((len +1)*(len+2))/2;
		int actualSum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			actualSum+=arr[i];
		}
		
		return expectedsume - actualSum;
	}

}
