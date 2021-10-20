package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		//jagged array -> row fix - col dynamic 
		int a[][] = new int[3][];//3*4=>12 => 24 byte 

		a[0] = new int[3];//0th row will get 3 col
		a[1] = new int[4];//1st row will get 4 col 
		a[2] = new int[2];//2nd row will get 2 col 

		
		Scanner scr = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter number");
				a[i][j] = scr.nextInt();
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
	}
}
