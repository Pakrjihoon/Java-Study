package oop;

import java.util.Scanner;

public class Ex01 extends Object{
	public static void main(String[] args) {
		int [] iArr = {1,3,5,7};
		Integer[] arr = new Integer[5];
	
		int idx = 0;
	
		for(int j: iArr) {
			arr[idx++] = j;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
