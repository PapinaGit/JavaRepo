package com.basic;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scn.nextLine();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}

	}

}
