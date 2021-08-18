package string;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "royal";
		String s2 = new String("royal");

		Scanner scr = new Scanner(System.in);
		System.out.println("enter your name");
//		String s = scr.next();//single word --without space 
		String s = scr.nextLine();
		System.out.println("Name  : " + s);
	}
}
//string --> 
//String class 