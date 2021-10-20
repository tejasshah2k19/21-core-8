package array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][];
		a = new int[3][4]; // 3 -> row 4->column

		int[] b[] = new int[3][4];

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Enter num");
				a[i][j] = scr.nextInt();
			}
		}
		System.out.println("Elements in 2D array");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
