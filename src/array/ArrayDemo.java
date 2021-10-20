package array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5];
		int[] b = new int[5];
		
 
		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value");
			a[i] = scr.nextInt();
		}

		System.out.println("Elements in an array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//10 20 30 40 50 
		//sum => 150
		//max => 50
		//min => 10 
		//oddCount = 3 
		//evenCount = 2 
		
		//remove duplicates from array 
			
	}
}
