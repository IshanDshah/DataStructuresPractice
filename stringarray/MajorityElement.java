package stringarray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] nums={1,1,1,1,1,1,1,2,3,4,5,6,7,8,9};
		 HashMap<Integer,Integer> hs=new HashMap<>();
	        for(int i:nums){
	            if(hs.containsKey(i)){
	            	hs.put(i, hs.get(i) +1);
	            }else{
	            	hs.put(i, 1);
	            }
	        }
	        for(Entry<Integer, Integer> entry:hs.entrySet()){
	        	if(entry.getValue()>(Math.floor(nums.length/2))){
	        		System.out.println(entry.getKey() + "The majority element");
	        	}
	        	
	        }
	        
	}

}
