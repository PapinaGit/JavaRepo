package com.basic;

import java.util.Scanner;

public class PallindromeNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int org_num = num;
		int rev = 0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org_num) {
			System.out.println(org_num+" is a Pallindrome Number");
		}else {
			System.out.println(org_num+" is not a Pallindrome Number");
		}
	}
}
