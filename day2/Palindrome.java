package week3.ss.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="madam";
		char[] charArray=str.toCharArray();
		
		int count=0;
		
		char a[]=new char[charArray.length];
		
		for(int i=charArray.length-1;i>=0;i--) {
			
			a[count]=charArray[i];
			count++;
			}
		
		if(Arrays.equals(charArray, a)) {
			System.out.println("its a palindrome");
		}else {
			System.out.println("its not a palindrome");
		}
		
		
		
		
		
		
		
		
		

	}

}
