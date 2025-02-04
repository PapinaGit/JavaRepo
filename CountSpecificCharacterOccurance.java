package com.basic;

public class CountSpecificCharacterOccurance {

	public static void main(String[] args) {
		String str = "Papina";
		int totalCount = str.length();
		int totalCount_afterRemovea = str.replaceAll("a", "").length();
		int count = totalCount - totalCount_afterRemovea;
		System.out.println("No. of specific given character is:" + count);
	}

}
