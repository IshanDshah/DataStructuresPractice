package stringarray;

import java.util.ArrayList;
import java.util.List;

public class DisAppearedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ans = disappeared(new int[] {4,3,2,7,8,2,3,1});
		//System.out.println(Math.abs(-4));
		System.out.println(ans.toString());
	}

	
	//Leet code solution
	private static List<Integer> disappeared(int[] nums) {
		// TODO Auto-generated method stub
	     List<Integer> result = new ArrayList<>();
	        for( int i=0;i< nums.length; i++){
	            int index = nums[i];
	            if(nums[Math.abs(index)-1] > 0){
	                nums[Math.abs(index)-1]= -nums[Math.abs(index)-1];
	            }
	        }
	        
	        for(int j =1 ;j <= nums.length ; j++){
	            if(nums[j-1] > 0){
	                result.add(j);
	            }
	        }
	        
		
		return result;
	}
	
	
	// My solution

}
