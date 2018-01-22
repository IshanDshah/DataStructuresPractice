package stringarray;

import java.util.HashMap;



public class findAnagramMappings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 12, 28, 46, 32, 50 };
		int[] B = { 50, 12, 32, 46, 28 };
		int[] ans=new int[A.length];
		HashMap<Integer, Integer> hs=new HashMap<>();
		for(int i=0;i<B.length;i++){
			hs.put(B[i],i);
		}
		
		int y=0;
		for(int x:A){
			
			ans[y]=hs.get(x);
			y++;
		}
		
		for(int i:ans){
			System.out.println(i);
		}
	}

}
