package com.basic;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scn.nextLine();
		
		String reverseString = "";
		String[] words = str.split(" ");
		
		for(String w:words) {
			String reverseWord = "";
			for(int i=w.length()-1; i>=0; i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println("Reverse of Each word is: "+reverseString);
		
	}

}
