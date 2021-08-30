package string;

public class StringMethods2 {

	public static void main(String[] args) {
		String s1 = "royal";
		String s2 = "royal";

		int same = 1;// they are same

//		s1 = s1.toLowerCase();
//		s2 = s2.toLowerCase();
		
		if (s1.length() != s2.length()) {
			same = 0; // not same
		} else {
			// royal
			// royaledu
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					same = 0;// not same
				}
			}
		}

		if (same == 1) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are not same");
		}

	}

}
