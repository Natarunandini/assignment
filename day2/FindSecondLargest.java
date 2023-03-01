package week3.ss.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("3");
		list.add("2");
		list.add("11");
		list.add("4");
		list.add("6");
		list.add("7");
		Collections.sort(list);
		
		System.out.println(list.get(5)+ "is the second largegst number");
		
		
		
		
		
	}

}
