package week3.ss.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		String s="PayPal India";
		s=s.toLowerCase();
		char[] charArray=s.toCharArray();
		Set<Character> charset=new LinkedHashSet<Character>();
		Set<Character> dupcharset=new LinkedHashSet<Character>();
		for(Character character:charArray) {
			if(!charset.add(character)) {
				dupcharset.add(character);
			}
			
			
		}
		
		charset.removeAll(dupcharset);
		System.out.print("After duplicates removed: ");
		for(Character unique :charset) {
			if(unique!=' ') {
				
				System.out.print(unique + " ");
			}
		}
		
		
		
		
	}

}
