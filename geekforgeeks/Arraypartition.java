package geekforgeeks;

import java.util.Arrays;
import java.util.List;


public class Arraypartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4};
		Arraypartition obj=new Arraypartition();
		System.out.println(obj.partitionSum(arr1));
	}

	
	
	public int partitionSum(int[] arr)
	{
		Arrays.sort(arr);
		int result=0;
		for(int i=0;i<arr.length;i+=2){
			result+=arr[i];
			
		}
		return result;
		
	}
}
