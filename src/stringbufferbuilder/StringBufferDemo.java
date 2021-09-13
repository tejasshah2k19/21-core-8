package stringbufferbuilder;

import java.lang.*;


public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("royal"); // lang => so we dont need to import 
		sb.append("education");
		System.out.println(sb); //royaleducation
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		String s = new String("royal");
		s.concat("education");
		System.out.println(s);//royal 

	
		System.out.println((char)(int)(Math.random()*100));
	
		
		while(true) {
			int k = (int)(Math.random()*100);
			
			if(k >= 65 && k <= 90 ||  k >= 97 && k<= 122) {
				System.out.println((char)k);
				break;
			}
		}
		
		
	}
}
