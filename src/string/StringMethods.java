package string;
//import java.lang.*;//String System Math 

public class StringMethods {

	public static void main(String[] args) {
		// 012345678
		String s = "ahmedabad";// char[]

		System.out.println(s.length());// count characters

		System.out.println(s.charAt(0));// charAt
//		System.out.println(s.charAt(20));//runtime error --> exception 

		System.out.println(s.indexOf('m'));// 2 search char and return index
		System.out.println(s.indexOf('d'));// 4 search char and return index -- FCFS
		System.out.println(s.lastIndexOf('d'));// 8 search char and return index -- from last

		s = "radheradheradhe"; // logic -> manual - java methods
		System.out.println(s.indexOf('r'));// begin
		System.out.println(s.lastIndexOf('r'));
	}
}
