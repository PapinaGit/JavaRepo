package com.basic;

import java.util.Scanner;

public class FindAlphabetIndex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scn.nextLine();
		str=str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				System.out.println(ch+" at index:"+i);
			}
		}
	}

}
