package com.basic;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class EachCharacterOccurance {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scn.nextLine();
		findingOccurance(str);
	}
	public static void findingOccurance(String str) {
		
		LinkedHashMap<Character,Integer> lhm= new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!lhm.containsKey(ch)) {
				lhm.put(ch, 1);
			}else {
				lhm.put(ch, lhm.get(ch)+1);
			}
		}
		
		Set<Character> keys = lhm.keySet();
		for(Character key:keys) {
			System.out.println(key+":"+lhm.get(key));
		}
	}

}
