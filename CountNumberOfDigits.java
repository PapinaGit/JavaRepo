package com.basic;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int count = 0;
		
		while(num>0) {
			int rem = num%10;
			count++;
			num=num/10;
		}
		
		System.out.println("No. of digits is: "+count);
	}

}
