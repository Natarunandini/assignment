package week3.ss.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		List<String> StringValues= Arrays.asList("HCL","Wipro","AspireSystems","CTS");
		
		Collections.sort(StringValues,Collections.reverseOrder());
		
		for(String value:StringValues) {
			System.out.println(value);
		}
		
		

	}

}
