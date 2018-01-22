package stringarray;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1={1,2,0,3,4,5,0,6,8,0,9};
		
		
		int position=0;
		int len=arr1.length;
		for(int i=0;i<arr1.length;i++)
		{
			
			if(arr1[i]!=0)
			{
				arr1[position++]=arr1[i];
			}
			
		}
		while(position!=len){
			arr1[position++]=0;
		}
		
		
		System.out.println(Arrays.toString(arr1));
		for (int i : arr1) {
			System.out.println(i);
		}
	}

}
