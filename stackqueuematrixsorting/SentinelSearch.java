package stackqueuematrixsorting;

public class SentinelSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1={1,2,23,4,5,6,7,8,9,0};
		
		sentinelSearch(arr1,5);
	}

	private static void sentinelSearch(int[] arr1, int i) {
		// TODO Auto-generated method stub
		
		int orLn=arr1.length;
		arr1[arr1.length]=i;
		int j=0;
		
		while(arr1[j]!=i){
			j++;
		}
		
		if(j<orLn)
			System.out.println("Present" + j);
		else
		{
			System.out.println("Not present");
		}
	}

}
