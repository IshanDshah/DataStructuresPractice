package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class listBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> asList=Arrays.asList(1,2,21,12312,12312341,32111239);
		System.out.println("the position of 12312 : " + Collections.binarySearch(asList, 12312));
		
		
		List<String> collectionObj=Arrays.asList("Red","Green","Yello","Blue");
		Iterator iteratorObj=collectionObj.iterator();
		
		
		while(iteratorObj.hasNext())
		{
			System.out.println("The colour is " + iteratorObj.next());
		}
	}

}
