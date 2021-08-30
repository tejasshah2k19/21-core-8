package string;

public class StringMethods3 {

	public static void main(String[] args) {

		String s1 = "royal";
		String s2 = "royal";
		String s3 = "roYal";

		// equals
		boolean ans = s1.equals(s2); // boolean ==> true | false
		System.out.println(ans);

		if (s1.equals(s2) == true) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

		if (s1.equals(s3) == true) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

		if (s1.toLowerCase().equals(s3.toLowerCase()) == true) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

		if (s1.equalsIgnoreCase(s3) == true) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

		int k = s1.compareTo(s2);// int-> same{0} -> notSame{diff}
		System.out.println(k);
		k = s1.compareTo(s3); // int ->same{0} -> notSame{diff}
		System.out.println(k);

		k = s1.compareToIgnoreCase(s2);//caseIgnore 
		
		
		
		
	}
}




