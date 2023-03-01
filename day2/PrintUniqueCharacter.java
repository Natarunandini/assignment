package week3.ss.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		 
		String name="Nandini";
		char[] charArray=name.toCharArray();
		
		Set<String> setname= new HashSet<String>();
		setname.add("n");
		setname.add("a");
		setname.add("d");
		setname.add("i");
		
		System.out.println(setname);

	}

}
