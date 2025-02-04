package com.basic;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int evenCount = 0, oddCount = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem-(rem/2)* 2 == 0) {
				evenCount++;
			} else {

				oddCount++;
			}
			num = num / 10;
		}
		System.out.println("No. of even count is: " + evenCount);
		System.out.println("No. of odd count is: " + oddCount);
	}

}
