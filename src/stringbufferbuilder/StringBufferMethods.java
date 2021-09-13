package stringbufferbuilder;

import java.util.Scanner;

public class StringBufferMethods {

	public static void main(String[] args) {
			Scanner scr = new Scanner(System.in);

			System.out.println("Enter a string");
			String str = scr.nextLine();

			StringBuffer sb = new StringBuffer(str);
			
			System.out.println(sb);
			sb.delete(0, 1);//first arg -> inclusive ->second arg -> exclusive 
			System.out.println(sb);
		
			sb.insert(0, "J");
			System.out.println(sb);

			sb.replace(5,9,"Jony");
			System.out.println(sb);
			
			sb.replace(10, 11, "Y");
			System.out.println(sb);
			
			sb = new StringBuffer("india");
			System.out.println(sb);
			
	}
}
