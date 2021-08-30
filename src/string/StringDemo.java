package string;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "royal";
		String s3 = "royal";
		String s4 = "goyal";
		String s2 = new String("royal");
		String s5 = new String("royal");
		String s6 = "royal";
		
		s3 = "education";
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter your name");
//		String s = scr.next();//single word --without space 
		String s = scr.nextLine();//multiple words 
		System.out.println("Name  : " + s);
	}
}
//string --> 
//String class 