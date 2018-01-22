package stringarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class WrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,2,4};
	        int[] ans=new int[2];
	        HashMap<Integer,Integer> hs=new LinkedHashMap<Integer, Integer>();
	        Arrays.sort(ans);
	        for(int i:nums)
	        {
	            if(hs.containsKey(i)){
	            	
	            	ans[0]=i;
	            	ans[1]=hs.get(i) +1;
	            }else
	            {
	            	hs.put(i, i);
	            }
	            
	        }
	        
	        System.out.println(ans[1]);
	    }
	}


