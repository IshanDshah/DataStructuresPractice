package stringarray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PairsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,2,3,2,1,2,3};
		
		List<Integer> ans=findPairs(arr,4);
		for(int i=0;i<ans.size()-1;i+=2){
			System.out.println("The pairs are " + ans.get(i) + "," + ans.get(i + 1));
		}
		
	}

	private static List<Integer> findPairs(int[] arr, int x) {
		// TODO Auto-generated method stub
		List<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i] + arr[j]==x && i!=j){
					ans.add(i);
					ans.add(j);
				}
			}
			
		}
		return ans;
	}
	
	

}
