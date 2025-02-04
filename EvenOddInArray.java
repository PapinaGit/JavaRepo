package com.basic;

public class EvenOddInArray {

	public static void main(String[] args) {

		int[] a = {25,18,37,12,19 };
		System.out.println("Even numbers are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd numbers are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
