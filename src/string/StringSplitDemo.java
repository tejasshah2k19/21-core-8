package string;

public class StringSplitDemo {

	public static void main(String[] args) {

		String data = "jan,feb,march,apr";
		String data2 = "                    mon tue wed thus fri ";

		String s[] = data.split(",");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		data2 = data2.trim(); // it will remove space from beg and end
								// but not from the middle data
		String m[] = data2.split(" ");

		for (int i = 0; i < m.length; i++) {
			System.out.println("=>" + m[i]);
		}

	}
}
