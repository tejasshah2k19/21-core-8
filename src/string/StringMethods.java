package string;
//import java.lang.*;//String System Math 

public class StringMethods {

	public static void main(String[] args) {
					//  012345678
			String s = "ahmedabad";
			System.out.println(s.length());//count characters 
			System.out.println(s.charAt(0));//charAt 
			System.out.println(s.indexOf('m'));//search char and return index 
			System.out.println(s.indexOf('d'));//search char and return index -- FCFS  
			System.out.println(s.lastIndexOf('d'));//search char and return index -- from last    
			
		s = "radheradheradhe"; // logic -> manual - java methods 
			System.out.println(s.indexOf('r'));
			System.out.println(s.lastIndexOf('r'));
	}
}
