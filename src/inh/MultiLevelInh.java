package inh;

public class MultiLevelInh {
	public static void main(String[] args) {

	}
}
class RBI{ //1 -> roi()
	void roi() {
		System.out.println("RBI::roi()");
	}
}
class ICICI extends RBI{ //2 -> savingAccount() roi()
	void savingAccount() {
		System.out.println("ICICI::saving()");
	}
}
class Lombard extends ICICI{//3 -> roi() savingAccount()  insurance()  
	void insurance() {
		System.out.println("ICICI::Insurance()");
	}
}














