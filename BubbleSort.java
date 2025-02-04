package com.basic;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = {25,43,19,37,68};
		int temp;
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int value:a) {
			System.out.print(value+" ");
		}
	}

}
