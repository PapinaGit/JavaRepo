package com.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int sum = 0;
		int org_num = num;
		
		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == org_num) {
			System.out.println(org_num + " is an armstrong number");
		} else {
			System.out.println(org_num + " is not armstrong number");
		}
	}

}
