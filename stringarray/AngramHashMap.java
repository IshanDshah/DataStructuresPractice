package stringarray;

import java.util.HashMap;

public class AngramHashMap {


		
		/* can be done in multiple ways
		 * 1)Using sort and arrays.equals mehtod
		 * 2) String Builder
		 * 3) HashMap
		 *  */
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			
			String s1="Ishan";
			String s2="Ishan";
			
			
			System.out.println(checkAnagram(s1,s2));
		}
		
		public static boolean checkAnagram(String s1,String s2){
			Boolean ans=false;
			
			if(s1.length()!=s2.length()){
				return false;
			}
			
			String srep1=s1.replaceAll(" ", "\\s+").toLowerCase();
			String srep2=s2.replaceAll(" ","\\s+").toLowerCase();
			
			HashMap<Character,Integer> hashmap=new HashMap<>();
			HashMap<Character,Integer> hashmap2=new HashMap<>();
			
			for(int i=0;i<srep1.length();i++)
			{
				if(hashmap.containsKey(srep1.charAt(i)))
				{
					hashmap.put(srep1.charAt(i), hashmap.get(srep1.charAt(i)) + 1);
					
				}else
				{
					hashmap.put(srep1.charAt(i), 1);
				}
				
					
			}
			
			for(int i=0;i<srep2.length();i++)
			{
				if(hashmap2.containsKey(srep2.charAt(i)))
				{
					hashmap2.put(srep2.charAt(i), hashmap2.get(srep2.charAt(i)) + 1);
					
				}else
				{
					hashmap2.put(srep2.charAt(i), 1);
				}
				
					
			}
		
			
			
			
			return hashmap.entrySet().equals(hashmap2.entrySet());
			
			
			
			
			
		}

	}


