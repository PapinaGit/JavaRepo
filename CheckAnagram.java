package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first String:");
		String str1 = scn.nextLine();
		System.out.println("Enter second String:");
		String str2 = scn.nextLine();
		if(isAnagram(str1,str2)) {
			System.out.println("The strings are anagram");
		}else {
			System.out.println("The strings are not anagram");
		}
	}
	public static boolean isAnagram(String str1,String str2) {
		str1=str1.replaceAll("\\s","").toLowerCase();
		str2=str2.replaceAll("\\s","").toLowerCase();
	
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}

}
