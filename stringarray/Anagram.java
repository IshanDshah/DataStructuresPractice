package stringarray;

import java.util.HashMap;
import java.util.Set;

public class Anagram {

	
	/* can be done in multiple ways
	 * 1)Using sort and arrays.equals mehtod
	 * 2) String Builder
	 * 3) HashMap
	 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1="Ishan";
		String s2="isnha";
		
		
		System.out.println(checkAnagram(s1,s2));
	}
	
	public static boolean checkAnagram(String s1,String s2){
		Boolean ans=false;
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		String srep1=s1.replaceAll(" ", "//s+").toLowerCase();
		String srep2=s2.replaceAll(" ","//s+").toLowerCase();
		System.out.println(srep1);
		System.out.println(srep2);
		
		HashMap<Character,Integer> hashmap=new HashMap<>();
		
		for(int i=0;i<srep1.length();i++)
		{
			if(hashmap.containsKey(srep1.charAt(i)))
			{
				hashmap.put(srep1.charAt(i), hashmap.get(srep1.charAt(i)) + 1);
				
			}else
			{
				hashmap.put(srep1.charAt(i), 1);
			}
			
			
			char c=srep2.charAt(i);
			System.out.println(c);
			if(hashmap.containsKey(c))
			{
				System.out.println(c);
				hashmap.put(c, hashmap.get(c) -1);
			}
			
		}
		System.out.println(hashmap.values());
		System.out.println(hashmap.keySet());
		
		
		for(Integer is:hashmap.values())
		{
			if(is!=0)
			{
				ans=false;
			}
		}
		
		return ans;
		
		
		
		
		
	}

}
